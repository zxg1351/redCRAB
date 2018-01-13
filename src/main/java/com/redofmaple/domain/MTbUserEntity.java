package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_user", schema = "test", catalog = "")
public class MTbUserEntity {
    private int id;
    private String mUserName;
    private String mUserAccount;
    private String mUserTel;
    private String mUserPassword;
    private String mUserImageurl;
    private String wxOpenId;
    private String wbOpenId;
    private String qqOpenId;
    private Timestamp createTime;
    private Integer createUser;
    private Timestamp updateTime;
    private Integer updateUser;
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
    @Column(name = "m_user_name", nullable = true, length = 45)
    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    @Basic
    @Column(name = "m_user_account", nullable = true, length = 45)
    public String getmUserAccount() {
        return mUserAccount;
    }

    public void setmUserAccount(String mUserAccount) {
        this.mUserAccount = mUserAccount;
    }

    @Basic
    @Column(name = "m_user_tel", nullable = true, length = 45)
    public String getmUserTel() {
        return mUserTel;
    }

    public void setmUserTel(String mUserTel) {
        this.mUserTel = mUserTel;
    }

    @Basic
    @Column(name = "m_user_password", nullable = true, length = 45)
    public String getmUserPassword() {
        return mUserPassword;
    }

    public void setmUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword;
    }

    @Basic
    @Column(name = "m_user_imageurl", nullable = true, length = 255)
    public String getmUserImageurl() {
        return mUserImageurl;
    }

    public void setmUserImageurl(String mUserImageurl) {
        this.mUserImageurl = mUserImageurl;
    }

    @Basic
    @Column(name = "wx_open_id", nullable = true, length = 45)
    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    @Basic
    @Column(name = "wb_open_id", nullable = true, length = 45)
    public String getWbOpenId() {
        return wbOpenId;
    }

    public void setWbOpenId(String wbOpenId) {
        this.wbOpenId = wbOpenId;
    }

    @Basic
    @Column(name = "qq_open_id", nullable = true, length = 45)
    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
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
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
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

        MTbUserEntity that = (MTbUserEntity) o;

        if (id != that.id) return false;
        if (mUserName != null ? !mUserName.equals(that.mUserName) : that.mUserName != null) return false;
        if (mUserAccount != null ? !mUserAccount.equals(that.mUserAccount) : that.mUserAccount != null) return false;
        if (mUserTel != null ? !mUserTel.equals(that.mUserTel) : that.mUserTel != null) return false;
        if (mUserPassword != null ? !mUserPassword.equals(that.mUserPassword) : that.mUserPassword != null)
            return false;
        if (mUserImageurl != null ? !mUserImageurl.equals(that.mUserImageurl) : that.mUserImageurl != null)
            return false;
        if (wxOpenId != null ? !wxOpenId.equals(that.wxOpenId) : that.wxOpenId != null) return false;
        if (wbOpenId != null ? !wbOpenId.equals(that.wbOpenId) : that.wbOpenId != null) return false;
        if (qqOpenId != null ? !qqOpenId.equals(that.qqOpenId) : that.qqOpenId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mUserName != null ? mUserName.hashCode() : 0);
        result = 31 * result + (mUserAccount != null ? mUserAccount.hashCode() : 0);
        result = 31 * result + (mUserTel != null ? mUserTel.hashCode() : 0);
        result = 31 * result + (mUserPassword != null ? mUserPassword.hashCode() : 0);
        result = 31 * result + (mUserImageurl != null ? mUserImageurl.hashCode() : 0);
        result = 31 * result + (wxOpenId != null ? wxOpenId.hashCode() : 0);
        result = 31 * result + (wbOpenId != null ? wbOpenId.hashCode() : 0);
        result = 31 * result + (qqOpenId != null ? qqOpenId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        return result;
    }
}
