//package com.example.ecommerce.util;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.stereotype.Component;
//
//import javax.crypto.spec.SecretKeySpec;
//import java.security.Key;
//import java.util.Base64;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//@Component
//public class JwtUtil {
//    public static final String SECRET = "9845";
//    public String generateToken(String username) {
//        Map<String, Object> claims = new HashMap<>();
//        return createToken(claims,username);
//    }
//    public String createToken(Map<String, Object> claims, String username) {
//        return Jwts.builder().setClaims(claims).setSubject(username).setIssuedAt(new Date(System.currentTimeMillis()))
//                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 7)).
//                signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
//    }
//
//    public Key getSignKey() {
//        byte[] keyBytes = Base64.getDecoder().decode(SECRET);
//        return new SecretKeySpec(keyBytes, "AES");
//    }
//
//    public String parseToken(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
//    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//        final Claims claims = extractALlClaim(token);
//        return claimsResolver.apply(claims);
//    }
//    private Claims extractALlClaim(String token) {
//        Jwts.parser().setSigningKey(getSignKey()).parseClaimsJws(token).getBody();
//    }
//}
