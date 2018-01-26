package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_employee", schema = "test", catalog = "")
public class MTbEmployeeEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "emp_code", nullable = false, length = 255)
    private String empCode;
    @Basic
    @Column(name = "emp_name", nullable = false, length = 255)
    private String empName;
    @Basic
    @Column(name = "emp_idcard", nullable = false, length = 255)
    private String empIdcard;
    @Basic
    @Column(name = "emp_mobile", nullable = false, length = 255)
    private String empMobile;
    @Basic
    @Column(name = "emp_address", nullable = true, length = 255)
    private String empAddress;
    @Basic
    @Column(name = "emp_emergencyContact", nullable = true, length = 255)
    private String empEmergencyContact;
    @Basic
    @Column(name = "login_name", nullable = false, length = 255)
    private String loginName;
    @Basic
    @Column(name = "emp_sex", nullable = true, length = 255)
    private String empSex;
    @Basic
    @Column(name = "emp_birthday", nullable = true, length = 255)
    private String empBirthday;
    @Basic
    @Column(name = "emp_email", nullable = true, length = 255)
    private String empEmail;
    @Basic
    @Column(name = "emp_eduction", nullable = true, length = 255)
    private String empEduction;
    @Basic
    @Column(name = "emp_age", nullable = true, length = 255)
    private String empAge;
    @Basic
    @Column(name = "emp_school", nullable = true, length = 255)
    private String empSchool;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Basic
    @Column(name = "salt", nullable = false, length = 255)
    private String salt;
    @Basic
    @Column(name = "department_id", nullable = true)
    private Integer departmentId;
    @Basic
    @Column(name = "emp_type", nullable = false, length = 255)
    private String empType;
    @Basic
    @Column(name = "delete_flag", nullable = true, length = 255)
    private String deleteFlag;

}
