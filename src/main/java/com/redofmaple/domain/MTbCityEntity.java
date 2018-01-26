package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_city", schema = "test", catalog = "")
public class MTbCityEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "tb_city_id", nullable = true, length = 36)
    private String tbCityId;
    @Basic
    @Column(name = "tb_city_name", nullable = true, length = 255)
    private String tbCityName;
    @Basic
    @Column(name = "tb_province_id", nullable = true)
    private Integer tbProvinceId;

}
