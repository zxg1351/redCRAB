package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
@Data
@Entity
@Table(name = "tb_banner", schema = "test", catalog = "")
public class MTbBannerEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m_banner_name", nullable = true, length = 45)
    private String mBannerName;
    @Basic
    @Column(name = "m_banner_url", nullable = true, length = 500)
    private String mBannerUrl;
    @Basic
    @Column(name = "m_banner_type", nullable = true, length = 1)
    private String mBannerType;
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
    private String delFlag;
    @Basic
    @Column(name = "delete_flag", nullable = true, length = 1)
    private String deleteFlag;

}
