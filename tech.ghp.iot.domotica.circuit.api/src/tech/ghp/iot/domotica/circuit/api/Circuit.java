package tech.ghp.iot.domotica.circuit.api;

import org.osgi.annotation.versioning.ProviderType;

/**
 * A service that turns a string to upper case
 */
@ProviderType
public interface Circuit {
	
	/**
	 * Turn string to upper case
	 */
	String upper(String input);
	
}
