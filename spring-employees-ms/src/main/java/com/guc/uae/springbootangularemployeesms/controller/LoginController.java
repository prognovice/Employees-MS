package com.guc.uae.springbootangularemployeesms.controller;

import com.guc.uae.springbootangularemployeesms.config.JwtTokenProvider;
import org.springframework.security.authentication.AuthenticationManager;
import com.guc.uae.springbootangularemployeesms.entity.User;
import com.guc.uae.springbootangularemployeesms.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/auth")
@RestController
public class LoginController {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;
    @Autowired
    private LoginService loginService;

@PostMapping("/login")
    public User loginUser(@RequestBody User user) throws Exception {
        User userObject=null;
       String userName= user.getUserName();

        String userPass=user.getUserPass();
        if(userName!=null && userPass!=null){
            userObject= loginService.getUserByUserNameAndUserPass(userName,userPass);

        }
        if(userObject==null){
            throw new Exception("Bad credentials");


        }
        return userObject;
    }
}
