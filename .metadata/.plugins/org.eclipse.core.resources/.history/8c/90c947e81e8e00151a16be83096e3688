package com.paypal.training;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SecureFileReader {
	
	public SecureFileReader(){
		
	}
	
	public void	readAndEncrypt(String filename,	EncryptionStrategy encryptor){
		BufferedReader br = null;
		
	}
	
	public static void main(String[] args) {
		SecureFileReader reader = new SecureFileReader();
		Rot13Encryption encryptor = new Rot13Encryption();
		InstrumentedRot13 encryptorDoc = new InstrumentedRot13(encryptor);
		reader.readAndEncrypt("C:\\Users\\gajg\\workspace\\Effective Java Examples\\exercise\\test.txt", encryptorDoc);
	}

}
