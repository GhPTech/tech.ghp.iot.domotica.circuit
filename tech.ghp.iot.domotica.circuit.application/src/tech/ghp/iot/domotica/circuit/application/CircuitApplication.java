package tech.ghp.iot.domotica.circuit.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.google.angular.capabilities.RequireAngularWebResource;
import osgi.enroute.rest.api.REST;
import osgi.enroute.twitter.bootstrap.capabilities.RequireBootstrapWebResource;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;
import tech.ghp.iot.domotica.circuit.api.Circuit;

@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="tech.ghp.iot.domotica.circuit")
public class CircuitApplication implements REST {

	public String getUpper(String string) {
		//return string.toUpperCase();
		return upper.upper(string);
	}
	
	@Reference
	Circuit upper;
}
