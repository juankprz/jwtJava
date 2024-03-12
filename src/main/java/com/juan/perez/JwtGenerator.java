package com.juan.perez;

import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
public class JwtGenerator {

    private final String secretKey;

    public JwtGenerator(String secretKey) {
        this.secretKey = secretKey;
    }

    public String generateToken(String subject, String issuer, long ttlMillis) {
        Claims claims = Jwts.claims().setSubject(subject).setIssuer(issuer);
        return Jwts.builder().setClaims(claims).signWith(SignatureAlgorithm.HS256, secretKey).setExpiration(new Date(System.currentTimeMillis() + ttlMillis)).compact();
    }
}