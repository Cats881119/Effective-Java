package com.paypal.training;

public class Rot13Encryption implements EncryptionStrategy{
	
	public String encrypt(String clearText) {
		
		StringBuilder sb = new StringBuilder(clearText.length());
	    char[] chars = clearText.toCharArray();
	    for (char c : chars) {
	        if (c >= 'a' && c <= 'm' || c >= 'A' && c <= 'M')
	            c += 13;
	        else if (c >= 'n' && c <= 'z' || c >= 'N' && c <= 'Z')
	            c -= 13;
	        sb.append(c);
	    }
	    return sb.toString();
	}
	

}
