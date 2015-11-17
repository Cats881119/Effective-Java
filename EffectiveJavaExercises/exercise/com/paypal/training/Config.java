package com.paypal.training;



public class Config {

	private final String	protocol;
	private final String	host;
	private final String	port;
	private final String	contextRoot;
	private final boolean	useCache = false;
	
	public String getHost(){
		return host;
	}
	
	public static class Builder {
	}
	private Config(Builder builder) {
	}
	@Override
	public String toString() {
		return protocol+":\\\\"+host+":"+port+"\\"+contextRoot;
	}
	public static void main(String[] args) {
		Config config =	new	Config.Builder("scispike").host("www.scispike.com").protocol("http").port("8080").
				useCache(true).build();
		System.out.printf("URL	for	%s:	%s\n",config.getHost(),	config);
	}
}
