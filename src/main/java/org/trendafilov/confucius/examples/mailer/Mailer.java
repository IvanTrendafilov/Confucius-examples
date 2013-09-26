package org.trendafilov.confucius.examples.mailer;

import static java.lang.System.out;

import org.trendafilov.confucius.Configurable;
import org.trendafilov.confucius.Configuration;

public class Mailer {
	public static void main(String[] args) {
		Configurable config = Configuration.getInstance();
		String context = config.getStringValue("conf.context", null);
		if (context != null)
			out.println("Launched via [" + context + "] context.");
		out.println("Hello, this is the " + config.getStringValue("agent.name"));
		out.println("Connecting to " + config.getStringValue("smtp.host") + " on " + config.getIntValue("smtp.port"));
		out.println("...using " + config.getStringValue("agent.auth") + " authentication key.");
		out.println("Spam filtering enabled: " + config.getBooleanValue("agent.spam", true) + "\n"); // if the value is not in the config, default to true
	}
}
