package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "m_type1", schema = "test", catalog = "")
public class MMType1Entity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "m1", nullable = true, length = 45)
    private String m1;
    @Basic
    @Column(name = "m2", nullable = true, length = 45)
    private String m2;
    @Basic
    @Column(name = "m3", nullable = true, length = 45)
    private String m3;
    @Basic
    @Column(name = "m4", nullable = true, length = 45)
    private String m4;
    @Basic
    @Column(name = "m5", nullable = true, length = 45)
    private String m5;
    @Basic
    @Column(name = "m6", nullable = true, length = 45)
    private String m6;
    @Basic
    @Column(name = "m7", nullable = true, length = 45)
    private String m7;
    @Basic
    @Column(name = "m8", nullable = true, length = 45)
    private String m8;
    @Basic
    @Column(name = "m9", nullable = true, length = 45)
    private String m9;
    @Basic
    @Column(name = "m10", nullable = true, length = 45)
    private String m10;
    @Basic
    @Column(name = "m11", nullable = true, length = 45)
    private String m11;
    @Basic
    @Column(name = "m12", nullable = true, length = 45)
    private String m12;
    @Basic
    @Column(name = "m13", nullable = true, length = 45)
    private String m13;
    @Basic
    @Column(name = "create_user", nullable = true)
    private Integer createUser;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
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

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getM3() {
        return m3;
    }

    public void setM3(String m3) {
        this.m3 = m3;
    }

    public String getM4() {
        return m4;
    }

    public void setM4(String m4) {
        this.m4 = m4;
    }

    public String getM5() {
        return m5;
    }

    public void setM5(String m5) {
        this.m5 = m5;
    }

    public String getM6() {
        return m6;
    }

    public void setM6(String m6) {
        this.m6 = m6;
    }

    public String getM7() {
        return m7;
    }

    public void setM7(String m7) {
        this.m7 = m7;
    }

    public String getM8() {
        return m8;
    }

    public void setM8(String m8) {
        this.m8 = m8;
    }

    public String getM9() {
        return m9;
    }

    public void setM9(String m9) {
        this.m9 = m9;
    }

    public String getM10() {
        return m10;
    }

    public void setM10(String m10) {
        this.m10 = m10;
    }

    public String getM11() {
        return m11;
    }

    public void setM11(String m11) {
        this.m11 = m11;
    }

    public String getM12() {
        return m12;
    }

    public void setM12(String m12) {
        this.m12 = m12;
    }

    public String getM13() {
        return m13;
    }

    public void setM13(String m13) {
        this.m13 = m13;
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

        MMType1Entity that = (MMType1Entity) o;

        if (id != that.id) return false;
        if (m1 != null ? !m1.equals(that.m1) : that.m1 != null) return false;
        if (m2 != null ? !m2.equals(that.m2) : that.m2 != null) return false;
        if (m3 != null ? !m3.equals(that.m3) : that.m3 != null) return false;
        if (m4 != null ? !m4.equals(that.m4) : that.m4 != null) return false;
        if (m5 != null ? !m5.equals(that.m5) : that.m5 != null) return false;
        if (m6 != null ? !m6.equals(that.m6) : that.m6 != null) return false;
        if (m7 != null ? !m7.equals(that.m7) : that.m7 != null) return false;
        if (m8 != null ? !m8.equals(that.m8) : that.m8 != null) return false;
        if (m9 != null ? !m9.equals(that.m9) : that.m9 != null) return false;
        if (m10 != null ? !m10.equals(that.m10) : that.m10 != null) return false;
        if (m11 != null ? !m11.equals(that.m11) : that.m11 != null) return false;
        if (m12 != null ? !m12.equals(that.m12) : that.m12 != null) return false;
        if (m13 != null ? !m13.equals(that.m13) : that.m13 != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (delFlag != null ? !delFlag.equals(that.delFlag) : that.delFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (m1 != null ? m1.hashCode() : 0);
        result = 31 * result + (m2 != null ? m2.hashCode() : 0);
        result = 31 * result + (m3 != null ? m3.hashCode() : 0);
        result = 31 * result + (m4 != null ? m4.hashCode() : 0);
        result = 31 * result + (m5 != null ? m5.hashCode() : 0);
        result = 31 * result + (m6 != null ? m6.hashCode() : 0);
        result = 31 * result + (m7 != null ? m7.hashCode() : 0);
        result = 31 * result + (m8 != null ? m8.hashCode() : 0);
        result = 31 * result + (m9 != null ? m9.hashCode() : 0);
        result = 31 * result + (m10 != null ? m10.hashCode() : 0);
        result = 31 * result + (m11 != null ? m11.hashCode() : 0);
        result = 31 * result + (m12 != null ? m12.hashCode() : 0);
        result = 31 * result + (m13 != null ? m13.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (delFlag != null ? delFlag.hashCode() : 0);
        return result;
    }
}
