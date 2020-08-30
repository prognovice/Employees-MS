package com.guc.uae.springbootangularemployeesms.service;

import com.guc.uae.springbootangularemployeesms.entity.User;
import com.guc.uae.springbootangularemployeesms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
@Autowired
private UserRepository _userRepository;
public User getUserByUserNameAndUserPass(String name,String passowrd){
return _userRepository.findByUserNameAndUserPass(name, passowrd);


}

}
