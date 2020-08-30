package com.guc.uae.springbootangularemployeesms.config;

import com.guc.uae.springbootangularemployeesms.entity.Role;
import com.guc.uae.springbootangularemployeesms.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.guc.uae.springbootangularemployeesms.entity.User;
import org.springframework.stereotype.Service;
import com.guc.uae.springbootangularemployeesms.repository.RoleRepository;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    private final RoleRepository authRoleRepository;

    public MyUserDetailsService(UserRepository userRepository, RoleRepository authRoleRepository) {
        super();
        this.userRepository = userRepository;
        this.authRoleRepository = authRoleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=this.userRepository.findByUserName(username);
if(null==user){
    throw  new UsernameNotFoundException("cannot find usrname: "+user);
}
        List<Role> roles=this.authRoleRepository.findByUserName(username);
        return new  MyUserDetails(user,roles);
    }
}
