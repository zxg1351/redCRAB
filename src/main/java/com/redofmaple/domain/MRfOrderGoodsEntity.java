package com.redofmaple.domain;

import javax.persistence.*;

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

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id", nullable = true)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "goods_id", nullable = true)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_nums", nullable = true, length = 255)
    public String getGoodsNums() {
        return goodsNums;
    }

    public void setGoodsNums(String goodsNums) {
        this.goodsNums = goodsNums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MRfOrderGoodsEntity that = (MRfOrderGoodsEntity) o;

        if (id != that.id) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (goodsNums != null ? !goodsNums.equals(that.goodsNums) : that.goodsNums != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (goodsNums != null ? goodsNums.hashCode() : 0);
        return result;
    }
}
