package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_large_area", schema = "test", catalog = "")
public class MTbLargeAreaEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "large_area_name", nullable = true, length = 255)
    private String largeAreaName;
    @Basic
    @Column(name = "large_area_code", nullable = true)
    private Integer largeAreaCode;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "update_user", nullable = true)
    private Integer updateUser;
    @Basic
    @Column(name = "update_time", nullable = true)
    private Timestamp updateTime;
    @Basic
    @Column(name = "delete_flag", nullable = true, length = 1)
    private String deleteFlag;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "large_area_name", nullable = true, length = 255)
    public String getLargeAreaName() {
        return largeAreaName;
    }

    public void setLargeAreaName(String largeAreaName) {
        this.largeAreaName = largeAreaName;
    }

    @Basic
    @Column(name = "large_area_code", nullable = true)
    public Integer getLargeAreaCode() {
        return largeAreaCode;
    }

    public void setLargeAreaCode(Integer largeAreaCode) {
        this.largeAreaCode = largeAreaCode;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user", nullable = true)
    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "update_user", nullable = true)
    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "delete_flag", nullable = true, length = 1)
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbLargeAreaEntity that = (MTbLargeAreaEntity) o;

        if (id != that.id) return false;
        if (largeAreaName != null ? !largeAreaName.equals(that.largeAreaName) : that.largeAreaName != null)
            return false;
        if (largeAreaCode != null ? !largeAreaCode.equals(that.largeAreaCode) : that.largeAreaCode != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (largeAreaName != null ? largeAreaName.hashCode() : 0);
        result = 31 * result + (largeAreaCode != null ? largeAreaCode.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        return result;
    }
}
