package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_large_area", schema = "test", catalog = "")
public class MTbLargeAreaEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "large_area_name", nullable = true, length = 255)
    private String largeAreaName;
    @Basic
    @Column(name = "large_area_code", nullable = true)
    private Integer largeAreaCode;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "update_user", nullable = true)
    private Integer updateUser;
    @Basic
    @Column(name = "update_time", nullable = true)
    private Timestamp updateTime;
    @Basic
    @Column(name = "delete_flag", nullable = true, length = 1)
    private String deleteFlag;

}
