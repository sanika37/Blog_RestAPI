package com.sanika.spring_boot_project.service;

import com.sanika.spring_boot_project.payload.LoginDto;
import com.sanika.spring_boot_project.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);
    String register(RegisterDto registerDto);

}