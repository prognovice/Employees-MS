package com.guc.uae.springbootangularemployeesms.entity;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "tbl_employees")
@Setter
@Getter
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="employee_id")
    private Long employeeId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name= "email_id")
    private String emailId;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="hire_date")
    private Date hireDate;
    @Column(name="salary")
    private int salary;
    @Column(name="gender")
    private String gender;
    @Column(name="marital_status")
    private String maritalStatus;
    @Column(name="nationality")
    private String nationality;
    @Column(name="photo")
    private String photo;
    @Column(name="driving_license")
    private String drivingLicense;
    @Column(name="military_status")
    private String militaryStatus;

    @ManyToOne
    @JoinColumn(name="department_id", nullable=false)
    private Department department;

    @OneToOne
    @JoinColumn(name="job_id", nullable=false)
    private Job job;

    @OneToOne
    @JoinColumn(name= "company_id", nullable=false)
    private Company company;



}
