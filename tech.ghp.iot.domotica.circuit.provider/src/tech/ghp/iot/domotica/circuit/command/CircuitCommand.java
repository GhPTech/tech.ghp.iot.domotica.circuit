package tech.ghp.iot.domotica.circuit.command;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import osgi.enroute.debug.api.Debug;
import osgi.enroute.iot.gpio.api.CircuitBoard;
import osgi.enroute.iot.gpio.api.IC;
import osgi.enroute.iot.gpio.util.Digital;
import osgi.enroute.iot.gpio.util.ICAdapter;
import osgi.enroute.scheduler.api.Scheduler;

@Component(service = IC.class, property = {Debug.COMMAND_SCOPE+"=domo", Debug.COMMAND_FUNCTION+"=led"})
public class CircuitCommand extends ICAdapter<Digital, Digital> implements Digital {
	
	private AtomicBoolean busy = new AtomicBoolean();
	private Scheduler scheduler;
	private int count;
	private Closeable schedule;

	@Override
	public void set(boolean value) throws Exception {
		
		if ( value && busy.getAndSet(true) == false) {
			count = 10;
			schedule = scheduler.schedule( ()-> {
				if ( count-- <= 0) {
					busy.set(false);
					schedule.close();
				}
				led( (count & 1) == 0);
			}, 500);
		}
	}
	
	public void led(boolean on) throws Exception {
			out().set(on);	
		}
	
	@Reference
	protected void setCircuitBoard(CircuitBoard cb) {
		super.setCircuitBoard(cb);
	}
	
	@Reference void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}
	

}
