package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "m_type1", schema = "test", catalog = "")
public class MMType1Entity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m1", nullable = true, length = 45)
    private String m1;
    @Basic
    @Column(name = "m2", nullable = true, length = 45)
    private String m2;
    @Basic
    @Column(name = "m3", nullable = true, length = 45)
    private String m3;
    @Basic
    @Column(name = "m4", nullable = true, length = 45)
    private String m4;
    @Basic
    @Column(name = "m5", nullable = true, length = 45)
    private String m5;
    @Basic
    @Column(name = "m6", nullable = true, length = 45)
    private String m6;
    @Basic
    @Column(name = "m7", nullable = true, length = 45)
    private String m7;
    @Basic
    @Column(name = "m8", nullable = true, length = 45)
    private String m8;
    @Basic
    @Column(name = "m9", nullable = true, length = 45)
    private String m9;
    @Basic
    @Column(name = "m10", nullable = true, length = 45)
    private String m10;
    @Basic
    @Column(name = "m11", nullable = true, length = 45)
    private String m11;
    @Basic
    @Column(name = "m12", nullable = true, length = 45)
    private String m12;
    @Basic
    @Column(name = "m13", nullable = true, length = 45)
    private String m13;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
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
