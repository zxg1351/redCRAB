package com.redofmaple.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_products", schema = "test", catalog = "")
public class MTbProductsEntity {
    private int id;
    private Integer vendId;
    private String prodName;
    private BigDecimal prodPrice;
    private String prodDesc;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "vend_id", nullable = true)
    public Integer getVendId() {
        return vendId;
    }

    public void setVendId(Integer vendId) {
        this.vendId = vendId;
    }

    @Basic
    @Column(name = "prod_name", nullable = true, length = 255)
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Basic
    @Column(name = "prod_price", nullable = true, precision = 2)
    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Basic
    @Column(name = "prod_desc", nullable = true, length = 255)
    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbProductsEntity that = (MTbProductsEntity) o;

        if (id != that.id) return false;
        if (vendId != null ? !vendId.equals(that.vendId) : that.vendId != null) return false;
        if (prodName != null ? !prodName.equals(that.prodName) : that.prodName != null) return false;
        if (prodPrice != null ? !prodPrice.equals(that.prodPrice) : that.prodPrice != null) return false;
        if (prodDesc != null ? !prodDesc.equals(that.prodDesc) : that.prodDesc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (vendId != null ? vendId.hashCode() : 0);
        result = 31 * result + (prodName != null ? prodName.hashCode() : 0);
        result = 31 * result + (prodPrice != null ? prodPrice.hashCode() : 0);
        result = 31 * result + (prodDesc != null ? prodDesc.hashCode() : 0);
        return result;
    }
}
