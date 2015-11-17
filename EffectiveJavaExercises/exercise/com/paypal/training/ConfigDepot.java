package com.paypal.training;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigDepot {

	static Map<String, Map<String, String>> globalMap = new HashMap<String, Map<String, String>>();

	public static Map<String, String> getConfig(String configFileName) {
		InputStream is = null;
		Map<String, String> map = null;
		try {
			globalMap.put(configFileName, map);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	public static void main(String[] args) {
		Map<String,String> devConfig = ConfigDepot.getConfig("dev.properties");
		System.out.printf("Development mode	configurations:\n\t%s\n",devConfig);
		System.out.printf("Development	mode	host:\n\t%s\n",	devConfig.get("host"));
		Map<String,	String>	prodConfig	= ConfigDepot.getConfig("prod.properties");
		System.out.printf("Production	mode configurations:\n\t%s\n",prodConfig);
		System.out.printf("Production	mode	host:\n\t%s\n",	prodConfig.get("host"));
	}
}
