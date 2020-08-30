package com.guc.uae.springbootangularemployeesms.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_departments")
@Setter
@Getter
@ToString
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="department_id")
    private Long departmentId;
    @Column(name="department_name")
    private String departmentName;


}
