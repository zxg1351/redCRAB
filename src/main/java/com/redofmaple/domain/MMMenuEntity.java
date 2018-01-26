package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "m_menu", schema = "test", catalog = "")
public class MMMenuEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m_menu_number", nullable = true, length = 45)
    private String mMenuNumber;
    @Basic
    @Column(name = "m_menu_url", nullable = true, length = 255)
    private String mMenuUrl;
    @Basic
    @Column(name = "m_menu_name", nullable = true, length = 45)
    private String mMenuName;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "update_user", nullable = true)
    private Integer updateUser;
    @Basic
    @Column(name = "update_time", nullable = true)
    private Timestamp updateTime;
    @Basic
    @Column(name = "del_flag", nullable = true, length = 1)
    private String delFlag;


}
