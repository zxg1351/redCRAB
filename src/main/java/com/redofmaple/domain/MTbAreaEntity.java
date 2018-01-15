package com.redofmaple.domain;

import javax.persistence.*;

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

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tb_area_id", nullable = true, length = 45)
    public String getTbAreaId() {
        return tbAreaId;
    }

    public void setTbAreaId(String tbAreaId) {
        this.tbAreaId = tbAreaId;
    }

    @Basic
    @Column(name = "tb_area_name", nullable = true, length = 45)
    public String getTbAreaName() {
        return tbAreaName;
    }

    public void setTbAreaName(String tbAreaName) {
        this.tbAreaName = tbAreaName;
    }

    @Basic
    @Column(name = "tb_city_id", nullable = true)
    public Integer getTbCityId() {
        return tbCityId;
    }

    public void setTbCityId(Integer tbCityId) {
        this.tbCityId = tbCityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbAreaEntity that = (MTbAreaEntity) o;

        if (id != that.id) return false;
        if (tbAreaId != null ? !tbAreaId.equals(that.tbAreaId) : that.tbAreaId != null) return false;
        if (tbAreaName != null ? !tbAreaName.equals(that.tbAreaName) : that.tbAreaName != null) return false;
        if (tbCityId != null ? !tbCityId.equals(that.tbCityId) : that.tbCityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tbAreaId != null ? tbAreaId.hashCode() : 0);
        result = 31 * result + (tbAreaName != null ? tbAreaName.hashCode() : 0);
        result = 31 * result + (tbCityId != null ? tbCityId.hashCode() : 0);
        return result;
    }
}
