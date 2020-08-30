package com.guc.uae.springbootangularemployeesms.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
    public static void main(String[] args) {
       System.out.println( new BCryptPasswordEncoder(11).encode("admin"));

    }

}
