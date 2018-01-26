package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "tb_area", schema = "test", catalog = "")
public class MTbAreaEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "tb_area_id", nullable = true, length = 45)
    private String tbAreaId;
    @Basic
    @Column(name = "tb_area_name", nullable = true, length = 45)
    private String tbAreaName;
    @Basic
    @Column(name = "tb_city_id", nullable = true)
    private Integer tbCityId;


}
