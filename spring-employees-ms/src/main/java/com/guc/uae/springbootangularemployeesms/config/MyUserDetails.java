package com.guc.uae.springbootangularemployeesms.config;
import com.guc.uae.springbootangularemployeesms.entity.Role;
import com.guc.uae.springbootangularemployeesms.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class MyUserDetails implements UserDetails {
private User user;
private List<Role> authRoles;
    public MyUserDetails(User user,List<Role> authRoles) {
        super();
        this.user=user;
        this.authRoles=authRoles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
if (null==authRoles)  {
    return Collections.emptySet();
}
        Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
        authRoles.forEach(role->{
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
        });
        return grantedAuthorities;

    }

    @Override
    public String getPassword() {
        return this.user.getUserPass();
    }

    @Override
    public String getUsername() {
        return this.user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
