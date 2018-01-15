package com.redofmaple.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_province", schema = "test", catalog = "")
public class MTbProvinceEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "province_id", nullable = true, length = 45)
    private String provinceId;
    @Basic
    @Column(name = "m_province_name", nullable = true, length = 45)
    private String mProvinceName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "province_id", nullable = true, length = 45)
    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "m_province_name", nullable = true, length = 45)
    public String getmProvinceName() {
        return mProvinceName;
    }

    public void setmProvinceName(String mProvinceName) {
        this.mProvinceName = mProvinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbProvinceEntity that = (MTbProvinceEntity) o;

        if (id != that.id) return false;
        if (provinceId != null ? !provinceId.equals(that.provinceId) : that.provinceId != null) return false;
        if (mProvinceName != null ? !mProvinceName.equals(that.mProvinceName) : that.mProvinceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (mProvinceName != null ? mProvinceName.hashCode() : 0);
        return result;
    }
}
