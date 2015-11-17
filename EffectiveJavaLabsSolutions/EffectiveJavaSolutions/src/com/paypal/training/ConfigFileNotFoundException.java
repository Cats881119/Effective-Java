package com.paypal.training;

import java.io.IOException;

public class ConfigFileNotFoundException extends Exception {

	public ConfigFileNotFoundException(String configFileName, IOException e) {
		super("The config file, " + configFileName + ", is not found.", e);
	}

	public ConfigFileNotFoundException(String configFileName) {
		super("The config file, " + configFileName + ", is not found.");
	}

}
