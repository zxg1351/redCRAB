package com.redofmaple.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_employee", schema = "test", catalog = "")
public class MTbEmployeeEntity {
    private int id;
    private String empCode;
    private String empName;
    private String empIdcard;
    private String empMobile;
    private String empAddress;
    private String empEmergencyContact;
    private String loginName;
    private String empSex;
    private String empBirthday;
    private String empEmail;
    private String empEduction;
    private String empAge;
    private String empSchool;
    private String password;
    private String salt;
    private Integer departmentId;
    private String empType;
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
    @Column(name = "emp_code", nullable = false, length = 255)
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    @Basic
    @Column(name = "emp_name", nullable = false, length = 255)
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "emp_idcard", nullable = false, length = 255)
    public String getEmpIdcard() {
        return empIdcard;
    }

    public void setEmpIdcard(String empIdcard) {
        this.empIdcard = empIdcard;
    }

    @Basic
    @Column(name = "emp_mobile", nullable = false, length = 255)
    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    @Basic
    @Column(name = "emp_address", nullable = true, length = 255)
    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Basic
    @Column(name = "emp_emergencyContact", nullable = true, length = 255)
    public String getEmpEmergencyContact() {
        return empEmergencyContact;
    }

    public void setEmpEmergencyContact(String empEmergencyContact) {
        this.empEmergencyContact = empEmergencyContact;
    }

    @Basic
    @Column(name = "login_name", nullable = false, length = 255)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "emp_sex", nullable = true, length = 255)
    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    @Basic
    @Column(name = "emp_birthday", nullable = true, length = 255)
    public String getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(String empBirthday) {
        this.empBirthday = empBirthday;
    }

    @Basic
    @Column(name = "emp_email", nullable = true, length = 255)
    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Basic
    @Column(name = "emp_eduction", nullable = true, length = 255)
    public String getEmpEduction() {
        return empEduction;
    }

    public void setEmpEduction(String empEduction) {
        this.empEduction = empEduction;
    }

    @Basic
    @Column(name = "emp_age", nullable = true, length = 255)
    public String getEmpAge() {
        return empAge;
    }

    public void setEmpAge(String empAge) {
        this.empAge = empAge;
    }

    @Basic
    @Column(name = "emp_school", nullable = true, length = 255)
    public String getEmpSchool() {
        return empSchool;
    }

    public void setEmpSchool(String empSchool) {
        this.empSchool = empSchool;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt", nullable = false, length = 255)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "department_id", nullable = true)
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "emp_type", nullable = false, length = 255)
    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    @Basic
    @Column(name = "delete_flag", nullable = true, length = 255)
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

        MTbEmployeeEntity that = (MTbEmployeeEntity) o;

        if (id != that.id) return false;
        if (empCode != null ? !empCode.equals(that.empCode) : that.empCode != null) return false;
        if (empName != null ? !empName.equals(that.empName) : that.empName != null) return false;
        if (empIdcard != null ? !empIdcard.equals(that.empIdcard) : that.empIdcard != null) return false;
        if (empMobile != null ? !empMobile.equals(that.empMobile) : that.empMobile != null) return false;
        if (empAddress != null ? !empAddress.equals(that.empAddress) : that.empAddress != null) return false;
        if (empEmergencyContact != null ? !empEmergencyContact.equals(that.empEmergencyContact) : that.empEmergencyContact != null)
            return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (empSex != null ? !empSex.equals(that.empSex) : that.empSex != null) return false;
        if (empBirthday != null ? !empBirthday.equals(that.empBirthday) : that.empBirthday != null) return false;
        if (empEmail != null ? !empEmail.equals(that.empEmail) : that.empEmail != null) return false;
        if (empEduction != null ? !empEduction.equals(that.empEduction) : that.empEduction != null) return false;
        if (empAge != null ? !empAge.equals(that.empAge) : that.empAge != null) return false;
        if (empSchool != null ? !empSchool.equals(that.empSchool) : that.empSchool != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (salt != null ? !salt.equals(that.salt) : that.salt != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;
        if (empType != null ? !empType.equals(that.empType) : that.empType != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (empCode != null ? empCode.hashCode() : 0);
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        result = 31 * result + (empIdcard != null ? empIdcard.hashCode() : 0);
        result = 31 * result + (empMobile != null ? empMobile.hashCode() : 0);
        result = 31 * result + (empAddress != null ? empAddress.hashCode() : 0);
        result = 31 * result + (empEmergencyContact != null ? empEmergencyContact.hashCode() : 0);
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (empSex != null ? empSex.hashCode() : 0);
        result = 31 * result + (empBirthday != null ? empBirthday.hashCode() : 0);
        result = 31 * result + (empEmail != null ? empEmail.hashCode() : 0);
        result = 31 * result + (empEduction != null ? empEduction.hashCode() : 0);
        result = 31 * result + (empAge != null ? empAge.hashCode() : 0);
        result = 31 * result + (empSchool != null ? empSchool.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        result = 31 * result + (empType != null ? empType.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        return result;
    }
}
