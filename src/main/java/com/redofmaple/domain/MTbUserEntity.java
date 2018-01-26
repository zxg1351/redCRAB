package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_user", schema = "test", catalog = "")
public class MTbUserEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m_user_name", nullable = true, length = 45)
    private String mUserName;
    @Basic
    @Column(name = "m_user_account", nullable = true, length = 45)
    private String mUserAccount;
    @Basic
    @Column(name = "m_user_tel", nullable = true, length = 45)
    private String mUserTel;
    @Basic
    @Column(name = "m_user_password", nullable = true, length = 45)
    private String mUserPassword;
    @Basic
    @Column(name = "m_user_imageurl", nullable = true, length = 255)
    private String mUserImageurl;
    @Basic
    @Column(name = "wx_open_id", nullable = true, length = 45)
    private String wxOpenId;
    @Basic
    @Column(name = "wb_open_id", nullable = true, length = 45)
    private String wbOpenId;
    @Basic
    @Column(name = "qq_open_id", nullable = true, length = 45)
    private String qqOpenId;
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
    @Column(name = "delete_flag", nullable = true, length = 1)
    private String deleteFlag;

}
