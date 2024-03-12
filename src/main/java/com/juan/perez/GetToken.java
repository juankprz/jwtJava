package com.juan.perez;
import com.juan.perez.JwtGenerator;

public class GetToken {

	public static void main(String[] args) {
		String secretKey = "yoursecretkeyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String subject = "yoursubject";
		String issuer = "yourissuer";
		long ttlMillis = 3600000; // 1 hora

		JwtGenerator generator = new JwtGenerator(secretKey);
		String token = generator.generateToken(subject, issuer, ttlMillis);

		System.out.println("Token: " + token);
	}

}
