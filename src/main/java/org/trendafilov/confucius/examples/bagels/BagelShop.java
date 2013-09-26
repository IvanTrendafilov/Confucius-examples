package org.trendafilov.confucius.examples.bagels;

import org.trendafilov.confucius.Configurable;
import org.trendafilov.confucius.Configuration;

public class BagelShop {
	
	public static void main(String[] args) {
		Configurable config = Configuration.getInstance();
		System.out.println("Hello and welcome to our store. " + config.getStringValue("slogan"));
		System.out.println("Today's selection: " + config.getStringList("bagels"));
	}
}
