package com.juan.perez;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class DecodedToken {

	public static void main(String[] args) {
		String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ5b3Vyc3ViamVjdCIsImlzcyI6InlvdXJpc3N1ZXIiLCJleHAiOjE3MTAyMTM4Nzl9.-6Vl3WhBQe8Vqc5YQ33_S_d2z0lz_hlGwYMmxuYpcs8"; // Reemplaza con tu token real

		try {
		  Claims claims = Jwts.parser()
		      .setSigningKey("yoursecretkeyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa") // Reemplaza con tu clave secreta
		      .parseClaimsJws(token)
		      .getBody();

		  // Accede a los claims del token
		  String subject = claims.getSubject();
		  String issuer = claims.getIssuer();
		  long expiration = claims.getExpiration().getTime();
		  // Accede a otros claims según sea necesario

		  System.out.println("Subject: " + subject);
		  System.out.println("Issuer: " + issuer);
		  System.out.println("Expiration: " + expiration);

		} catch (Exception e) {
		  // Maneja la excepción en caso de que el token sea inválido o la clave sea incorrecta
		  System.out.println("Error al decodificar el token: " + e.getMessage());
		}

	}

}
