package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "m_menu", schema = "test", catalog = "")
public class MMMenuEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m_menu_number", nullable = true, length = 45)
    private String mMenuNumber;
    @Basic
    @Column(name = "m_menu_url", nullable = true, length = 255)
    private String mMenuUrl;
    @Basic
    @Column(name = "m_menu_name", nullable = true, length = 45)
    private String mMenuName;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "update_user", nullable = true)
    private Integer updateUser;
    @Basic
    @Column(name = "update_time", nullable = true)
    private Timestamp updateTime;
    @Basic
    @Column(name = "del_flag", nullable = true, length = 1)
    private String delFlag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getmMenuNumber() {
        return mMenuNumber;
    }

    public void setmMenuNumber(String mMenuNumber) {
        this.mMenuNumber = mMenuNumber;
    }

    public String getmMenuUrl() {
        return mMenuUrl;
    }

    public void setmMenuUrl(String mMenuUrl) {
        this.mMenuUrl = mMenuUrl;
    }

    public String getmMenuName() {
        return mMenuName;
    }

    public void setmMenuName(String mMenuName) {
        this.mMenuName = mMenuName;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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

        MMMenuEntity that = (MMMenuEntity) o;

        if (id != that.id) return false;
        if (mMenuNumber != null ? !mMenuNumber.equals(that.mMenuNumber) : that.mMenuNumber != null) return false;
        if (mMenuUrl != null ? !mMenuUrl.equals(that.mMenuUrl) : that.mMenuUrl != null) return false;
        if (mMenuName != null ? !mMenuName.equals(that.mMenuName) : that.mMenuName != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (delFlag != null ? !delFlag.equals(that.delFlag) : that.delFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mMenuNumber != null ? mMenuNumber.hashCode() : 0);
        result = 31 * result + (mMenuUrl != null ? mMenuUrl.hashCode() : 0);
        result = 31 * result + (mMenuName != null ? mMenuName.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (delFlag != null ? delFlag.hashCode() : 0);
        return result;
    }
}
