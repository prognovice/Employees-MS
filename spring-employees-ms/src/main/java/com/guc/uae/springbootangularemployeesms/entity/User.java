package com.guc.uae.springbootangularemployeesms.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "user_name"
        })
})
@Setter
@Getter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long userId;


   @Column(name="user_name")
    private String userName;


    //@NotBlank
    //@Size(min=6, max = 100)
    @Column(name="user_pass")
    private String userPass;
;



}
