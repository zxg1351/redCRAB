package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_department", schema = "test", catalog = "")
public class MTbDepartmentEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "department_name", nullable = false, length = 255)
    private String departmentName;
    @Basic
    @Column(name = "department_code", nullable = false, length = 255)
    private String departmentCode;
    @Basic
    @Column(name = "delete_flag", nullable = true, length = 255)
    private String deleteFlag;
    @Basic
    @Column(name = "create_user", nullable = true, length = 255)
    private String createUser;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "update_user", nullable = true, length = 36)
    private Timestamp updateUser;
    @Basic
    @Column(name = "update_date", nullable = true)
    private Timestamp updateDate;

}
