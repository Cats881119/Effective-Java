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
		//every class variable is private in this method
		private String contextRoot;
		private String	protocol;
		private String	host;
		private String	port;
		private boolean	useCache = false;
		
	    public Builder(String contextRoot){
	    	this.contextRoot=contextRoot;
	    }
	    
	    public Builder host(String host){
	    	this.host=host;
	    	return this;
	    }
	    
	    public Builder port(String port){
	    	this.port=port;
	    	return this;
	    }
	    public Builder protocol(String p){
	    	this.protocol=p;
	    	return this;
	    }
	    public Builder useCache(boolean s){
	    	this.useCache=s;
	    	return this;
	    }
	    
	    public Config build(){
	    	return new Config(this);
	    }
 
	}
	private Config(Builder builder) {
		this.contextRoot=builder.contextRoot;
		this.port=builder.port;
		this.protocol=builder.protocol;
		this.host= builder.host;
		
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
