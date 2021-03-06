package org.weso.wesearch.domain.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.weso.utils.WesearchException;
import org.weso.wesearch.domain.Properties;
import org.weso.wesearch.domain.Property;

/**
 * It's an implementation of the interface Properties
 * @author Ignacio Fuertes Bernardo
 *
 */
public class PropertiesImpl implements Properties {
	
	private static Logger logger = Logger.getLogger(PropertiesImpl.class);
	
	/**
	 * A set of properties that contains all the properties stored by the object
	 */
	Set<Property> properties;
	
	/**
	 * It's the constructor of the class
	 */
	public PropertiesImpl() {
		properties = new HashSet<Property>();
	}

	@Override
	public Property getPropertyByName(String propertyName) 
			throws WesearchException {
		Iterator<Property> it = iterator();
		
		while(it.hasNext()) {
			Property prop = it.next();
			
			if(prop.getLabel().equalsIgnoreCase(propertyName) 
					|| prop.getLabel().contains(propertyName)) {
				return prop;
			}
		}
		logger.error("There isn't any property with name " + propertyName);
		throw new WesearchException("There isn't any property with name " 
				+ propertyName);
		
	}

	@Override
	public Iterator<Property> iterator() {
		return properties.iterator();
	}

	@Override
	public void addProperty(Property prop) {
		if(prop == null) {
			throw new IllegalArgumentException("The parameter can not be null");
		}
		properties.add(prop);
	}

}
