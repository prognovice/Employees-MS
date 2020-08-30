package com.guc.uae.springbootangularemployeesms.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table(name = "tbl_companies")
@Setter
@Getter
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="company_id")
    private Long companyId;
    @Column(name="company_name")
    private Long companyName;
}
