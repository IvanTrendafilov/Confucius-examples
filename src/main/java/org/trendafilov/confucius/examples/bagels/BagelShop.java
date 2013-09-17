package org.trendafilov.confucius.examples.bagels;

import org.trendafilov.confucius.*;
import org.trendafilov.confucius.core.ConfigurationException;

public class BagelShop {
	
	public static void main(String[] args) throws ConfigurationException {
		Configurable config = Configuration.getInstance();
		System.out.println("Hello and welcome to our store. " + config.getStringValue("slogan"));
		System.out.println("Today's selection: " + config.getStringList("bagels"));
	}
}
