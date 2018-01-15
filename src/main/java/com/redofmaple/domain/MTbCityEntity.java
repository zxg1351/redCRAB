package com.redofmaple.domain;

import javax.persistence.*;

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

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tb_city_id", nullable = true, length = 45)
    public String getTbCityId() {
        return tbCityId;
    }

    public void setTbCityId(String tbCityId) {
        this.tbCityId = tbCityId;
    }

    @Basic
    @Column(name = "tb_city_name", nullable = true, length = 45)
    public String getTbCityName() {
        return tbCityName;
    }

    public void setTbCityName(String tbCityName) {
        this.tbCityName = tbCityName;
    }

    @Basic
    @Column(name = "tb_province_id", nullable = true)
    public Integer getTbProvinceId() {
        return tbProvinceId;
    }

    public void setTbProvinceId(Integer tbProvinceId) {
        this.tbProvinceId = tbProvinceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbCityEntity that = (MTbCityEntity) o;

        if (id != that.id) return false;
        if (tbCityId != null ? !tbCityId.equals(that.tbCityId) : that.tbCityId != null) return false;
        if (tbCityName != null ? !tbCityName.equals(that.tbCityName) : that.tbCityName != null) return false;
        if (tbProvinceId != null ? !tbProvinceId.equals(that.tbProvinceId) : that.tbProvinceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tbCityId != null ? tbCityId.hashCode() : 0);
        result = 31 * result + (tbCityName != null ? tbCityName.hashCode() : 0);
        result = 31 * result + (tbProvinceId != null ? tbProvinceId.hashCode() : 0);
        return result;
    }
}
