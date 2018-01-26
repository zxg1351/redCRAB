package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_vendors", schema = "test", catalog = "")
public class MTbVendorsEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "vend_name", nullable = true, length = 255)
    private String vendName;
    @Basic
    @Column(name = "vend_address", nullable = true, length = 255)
    private String vendAddress;
    @Basic
    @Column(name = "vend_city", nullable = true, length = 255)
    private String vendCity;
    @Basic
    @Column(name = "vend_state", nullable = true, length = 255)
    private String vendState;
    @Basic
    @Column(name = "vend_zip", nullable = true, length = 255)
    private String vendZip;
    @Basic
    @Column(name = "vend_country", nullable = true, length = 255)
    private String vendCountry;

}
