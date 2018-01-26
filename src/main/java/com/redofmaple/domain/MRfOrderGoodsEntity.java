package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rf_order_goods", schema = "test", catalog = "")
public class MRfOrderGoodsEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "order_id", nullable = false)
    private Integer orderId;
    @Basic
    @Column(name = "goods_id", nullable = false)
    private Integer goodsId;
    @Basic
    @Column(name = "goods_nums", nullable = true, length = 255)
    private String goodsNums;


}
