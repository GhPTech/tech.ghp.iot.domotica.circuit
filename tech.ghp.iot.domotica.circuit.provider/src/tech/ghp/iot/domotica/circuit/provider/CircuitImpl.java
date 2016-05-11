package tech.ghp.iot.domotica.circuit.provider;

import org.osgi.service.component.annotations.Component;

import tech.ghp.iot.domotica.circuit.api.Circuit;

/**
 * 
 */
@Component(name = "tech.ghp.iot.domotica.circuit")
public class CircuitImpl implements Circuit{
		public String upper(String input){
			return input.toUpperCase();
		}

}
