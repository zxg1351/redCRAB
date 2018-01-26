package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "tb_products", schema = "test", catalog = "")
public class MTbProductsEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "vend_id", nullable = true)
    private Integer vendId;
    @Basic
    @Column(name = "prod_name", nullable = true, length = 255)
    private String prodName;
    @Basic
    @Column(name = "prod_price", nullable = true, precision = 2)
    private BigDecimal prodPrice;
    @Basic
    @Column(name = "prod_desc", nullable = true, length = 255)
    private String prodDesc;


}
