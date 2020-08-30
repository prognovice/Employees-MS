package com.guc.uae.springbootangularemployeesms.repository;

import com.guc.uae.springbootangularemployeesms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface UserRepository extends JpaRepository<User,Long> {
    @CrossOrigin("http://localhost:4200")
    User findByUserNameAndUserPass(String userName,String userPass);
    User findByUserName(String userName);

}
