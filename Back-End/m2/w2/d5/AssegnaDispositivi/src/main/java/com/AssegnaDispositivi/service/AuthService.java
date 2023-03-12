package com.AssegnaDispositivi.service;

import com.AssegnaDispositivi.payload.LoginDto;
import com.AssegnaDispositivi.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
