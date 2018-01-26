package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "m_role", schema = "test", catalog = "")
public class MMRoleEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m_role_name", nullable = true, length = 45)
    private String mRoleName;
    @Basic
    @Column(name = "m_role_number", nullable = true, length = 45)
    private String mRoleNumber;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "update_time", nullable = true)
    private Timestamp updateTime;
    @Basic
    @Column(name = "update_user", nullable = true)
    private Integer updateUser;
    @Basic
    @Column(name = "del_flag", nullable = true, length = 1)
    private String delFlag;


}
