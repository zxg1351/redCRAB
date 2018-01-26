package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_province", schema = "test", catalog = "")
public class MTbProvinceEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "province_id", nullable = true, length = 45)
    private String provinceId;
    @Basic
    @Column(name = "m_province_name", nullable = true, length = 45)
    private String mProvinceName;

}
