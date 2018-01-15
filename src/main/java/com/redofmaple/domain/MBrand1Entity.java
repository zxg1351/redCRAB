package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "brand1", schema = "test", catalog = "")
public class MBrand1Entity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "brand_name", nullable = true, length = 45)
    private String brandName;
    @Basic
    @Column(name = "brand_pic_url", nullable = true, length = 500)
    private String brandPicUrl;
    @Basic
    @Column(name = "brand_introduce", nullable = true, length = 500)
    private String brandIntroduce;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "update_time", nullable = true)
    private Timestamp updateTime;
    @Basic
    @Column(name = "update_user", nullable = true)
    private Integer updateUser;
    @Basic
    @Column(name = "del_flag", nullable = true, length = 1)
    private String delFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandPicUrl() {
        return brandPicUrl;
    }

    public void setBrandPicUrl(String brandPicUrl) {
        this.brandPicUrl = brandPicUrl;
    }

    public String getBrandIntroduce() {
        return brandIntroduce;
    }

    public void setBrandIntroduce(String brandIntroduce) {
        this.brandIntroduce = brandIntroduce;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MBrand1Entity that = (MBrand1Entity) o;

        if (id != that.id) return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (brandPicUrl != null ? !brandPicUrl.equals(that.brandPicUrl) : that.brandPicUrl != null) return false;
        if (brandIntroduce != null ? !brandIntroduce.equals(that.brandIntroduce) : that.brandIntroduce != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (delFlag != null ? !delFlag.equals(that.delFlag) : that.delFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (brandPicUrl != null ? brandPicUrl.hashCode() : 0);
        result = 31 * result + (brandIntroduce != null ? brandIntroduce.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (delFlag != null ? delFlag.hashCode() : 0);
        return result;
    }
}
