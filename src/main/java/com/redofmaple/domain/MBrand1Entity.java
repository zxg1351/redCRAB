package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "brand1", schema = "test", catalog = "")
public class MBrand1Entity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "brand_name", nullable = true, length = 45)
    private String brandName;
    @Basic
    @Column(name = "brand_pic_url", nullable = true, length = 500)
    private String brandPicUrl;
    @Basic
    @Column(name = "brand_introduce", nullable = true, length = 500)
    private String brandIntroduce;
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
