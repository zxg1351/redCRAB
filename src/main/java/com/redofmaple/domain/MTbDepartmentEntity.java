package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_department", schema = "test", catalog = "")
public class MTbDepartmentEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "department_name", nullable = false, length = 255)
    private String departmentName;
    @Basic
    @Column(name = "department_code", nullable = false, length = 255)
    private String departmentCode;
    @Basic
    @Column(name = "delete_flag", nullable = true, length = 255)
    private String deleteFlag;
    @Basic
    @Column(name = "create_user", nullable = true, length = 255)
    private String createUser;
    @Basic
    @Column(name = "create_date", nullable = true)
    private Timestamp createDate;
    @Basic
    @Column(name = "update_user", nullable = true, length = 36)
    private Timestamp updateUser;
    @Basic
    @Column(name = "update_date", nullable = true)
    private Timestamp updateDate;

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "department_name", nullable = false, length = 255)
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "department_code", nullable = false, length = 255)
    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Basic
    @Column(name = "delete_flag", nullable = true, length = 255)
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Basic
    @Column(name = "create_user", nullable = true, length = 255)
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_user", nullable = true)
    public Timestamp getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Timestamp updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "update_date", nullable = true)
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbDepartmentEntity that = (MTbDepartmentEntity) o;

        if (id != that.id) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (departmentCode != null ? !departmentCode.equals(that.departmentCode) : that.departmentCode != null)
            return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (updateDate != null ? !updateDate.equals(that.updateDate) : that.updateDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (departmentCode != null ? departmentCode.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (updateDate != null ? updateDate.hashCode() : 0);
        return result;
    }
}
