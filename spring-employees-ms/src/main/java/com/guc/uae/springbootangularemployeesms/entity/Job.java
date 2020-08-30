package com.guc.uae.springbootangularemployeesms.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tbl_jobs")
@Setter
@Getter
@ToString
public class Job {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="job_id")
    private Long jobId;
    @Column(name="job_title")
    private String jobTitle;


}
