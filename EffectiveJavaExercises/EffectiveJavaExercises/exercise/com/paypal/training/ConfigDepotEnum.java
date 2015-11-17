package com.paypal.training;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public enum ConfigDepotEnum {
	INSTANCE;
	static Map<String, Map<String, String>> globalMap = new HashMap<String, Map<String, String>>();

	private ConfigDepotEnum() {}
	public static ConfigDepotEnum getInstance(){
		return INSTANCE;
	}
public Map<String, String> getConfig(String configFileName) {
		
		if (globalMap.containsKey(configFileName))
		{
			return globalMap.get(configFileName);
		}
		
		InputStream is = ConfigDepotEnum.class.getClassLoader().getResourceAsStream(configFileName);
		Map<String, String> map = null;
		try {
			Properties prop = new Properties();
			prop.load(is);
			map = (Map) prop;
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
		ConfigDepotEnum configDepot = ConfigDepotEnum.getInstance();
		Map<String,String> devConfig = configDepot.getConfig("dev.properties");
		System.out.printf("Development mode	configurations:\n\t%s\n",devConfig);
		System.out.printf("Development	mode	host:\n\t%s\n",	devConfig.get("host"));
		Map<String,	String>	prodConfig	= configDepot.getConfig("prod.properties");
		System.out.printf("Production	mode configurations:\n\t%s\n",prodConfig);
		System.out.printf("Production	mode	host:\n\t%s\n",	prodConfig.get("host"));
		prodConfig.put("host", "myHost");
		Map<String,	String>	prodConfig2	= ConfigDepotEnum.INSTANCE.getConfig("prod.properties");
		System.out.println("host = " + prodConfig2.get("host"));
	}
}
