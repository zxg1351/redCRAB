package com.redofmaple.domain;

import javax.persistence.*;

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

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "vend_name", nullable = true, length = 255)
    public String getVendName() {
        return vendName;
    }

    public void setVendName(String vendName) {
        this.vendName = vendName;
    }

    @Basic
    @Column(name = "vend_address", nullable = true, length = 255)
    public String getVendAddress() {
        return vendAddress;
    }

    public void setVendAddress(String vendAddress) {
        this.vendAddress = vendAddress;
    }

    @Basic
    @Column(name = "vend_city", nullable = true, length = 255)
    public String getVendCity() {
        return vendCity;
    }

    public void setVendCity(String vendCity) {
        this.vendCity = vendCity;
    }

    @Basic
    @Column(name = "vend_state", nullable = true, length = 255)
    public String getVendState() {
        return vendState;
    }

    public void setVendState(String vendState) {
        this.vendState = vendState;
    }

    @Basic
    @Column(name = "vend_zip", nullable = true, length = 255)
    public String getVendZip() {
        return vendZip;
    }

    public void setVendZip(String vendZip) {
        this.vendZip = vendZip;
    }

    @Basic
    @Column(name = "vend_country", nullable = true, length = 255)
    public String getVendCountry() {
        return vendCountry;
    }

    public void setVendCountry(String vendCountry) {
        this.vendCountry = vendCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbVendorsEntity that = (MTbVendorsEntity) o;

        if (id != that.id) return false;
        if (vendName != null ? !vendName.equals(that.vendName) : that.vendName != null) return false;
        if (vendAddress != null ? !vendAddress.equals(that.vendAddress) : that.vendAddress != null) return false;
        if (vendCity != null ? !vendCity.equals(that.vendCity) : that.vendCity != null) return false;
        if (vendState != null ? !vendState.equals(that.vendState) : that.vendState != null) return false;
        if (vendZip != null ? !vendZip.equals(that.vendZip) : that.vendZip != null) return false;
        if (vendCountry != null ? !vendCountry.equals(that.vendCountry) : that.vendCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (vendName != null ? vendName.hashCode() : 0);
        result = 31 * result + (vendAddress != null ? vendAddress.hashCode() : 0);
        result = 31 * result + (vendCity != null ? vendCity.hashCode() : 0);
        result = 31 * result + (vendState != null ? vendState.hashCode() : 0);
        result = 31 * result + (vendZip != null ? vendZip.hashCode() : 0);
        result = 31 * result + (vendCountry != null ? vendCountry.hashCode() : 0);
        return result;
    }
}
