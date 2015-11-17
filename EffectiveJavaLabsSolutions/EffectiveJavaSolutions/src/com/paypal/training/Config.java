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
		// Required parameters
		private String contextRoot = null;
		
		// Optional parameters
		private  String	protocol = null;
		private  String	host = null;
		private  String	port = null;
		private  boolean	useCache = false;
			
		public Builder(String contextRoot) {
			this.contextRoot = contextRoot;
			
		}
		//本质上是返回了一个updated过得builder本身
		public Builder protocol(String s) {
			this.protocol = s;
			return this;
		}
		public Builder host(String s) {
			this.host = s;
			return this;
		}
		public Builder port(String s) {
			this.port = s;
			return this;
		}
		public Builder useCache(boolean s) {
			this.useCache = s;
			return this;
		}
		public Config build() {
			return new Config(this);
		}
		
	}
	private Config(Builder builder) {
		this.contextRoot = builder.contextRoot;
		this.host = builder.host;
		this.port = builder.port;
		this.protocol = builder.protocol;
		
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
