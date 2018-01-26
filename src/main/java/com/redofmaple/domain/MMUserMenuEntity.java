package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "m_user_menu", schema = "test", catalog = "")
public class MMUserMenuEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m_user_id", nullable = true)
    private Integer mUserId;
    @Basic
    @Column(name = "m_menu_id", nullable = true)
    private Integer mMenuId;
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
