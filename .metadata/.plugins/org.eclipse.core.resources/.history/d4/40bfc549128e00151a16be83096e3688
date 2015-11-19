package com.paypal.training;

public class InstrumentedRot13 implements EncryptionStrategy{

	EncryptionStrategy stat;
	public InstrumentedRot13(EncryptionStrategy stat){
		this.stat = stat;
	}
	@Override
	public String encrypt(String clearText) {
		// TODO - determine how long it takes to do the encryption
		String ret = stat.encrypt(clearText);
		return ret;
	}
}
