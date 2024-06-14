package com.example.myapp.service;

import io.jsonwebtoken.Claims;

public interface JwtService {
    
    String getToken(String key, Object value);

    Claims getClaims(String token);

    boolean isValid(String token); //사용자에 대한 토큰이 유효한지

    int  getId(String token); //토큰 사용자로부터 id를 얻어오는 형태

}
