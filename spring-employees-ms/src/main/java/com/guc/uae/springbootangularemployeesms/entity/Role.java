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
@Table(name = "tbl_roles", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "user_name","role"
        })
})
@Setter
@Getter
@ToString

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long roleId;
    @Column(name="user_name")
    private String userName;
    @Column(name="role")
    private String role;



}
