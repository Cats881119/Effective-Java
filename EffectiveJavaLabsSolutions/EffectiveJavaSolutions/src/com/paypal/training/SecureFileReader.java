package com.paypal.training;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SecureFileReader {
	
	public SecureFileReader(){
		
	}
	
	public void	readAndEncrypt(String filename,	EncryptionStrategy encryptor){
		BufferedReader br = null;
		try{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
			String tmp = "";
			while((tmp = br.readLine()) != null){
				System.out.println(tmp);
				String newTmp = encryptor.encrypt(tmp);
				System.out.println(newTmp);
				System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(br != null)
					br.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		SecureFileReader reader = new SecureFileReader();
		Rot13Encryption encryptor = new Rot13Encryption();
		InstrumentedRot13 encryptorDoc = new InstrumentedRot13(encryptor);
		reader.readAndEncrypt("C:\\Users\\gajg\\workspace\\Effective Java Examples\\exercise\\test.txt", encryptorDoc);
	}

}
