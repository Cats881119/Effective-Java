package com.paypal.training;

public class InstrumentedRot13 implements EncryptionStrategy{

	EncryptionStrategy stat;
	public InstrumentedRot13(EncryptionStrategy stat){
		this.stat = stat;
	}
	@Override
	public String encrypt(String clearText) {
		long start = System.currentTimeMillis();
		String ret = stat.encrypt(clearText);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		return ret;
	}
}
