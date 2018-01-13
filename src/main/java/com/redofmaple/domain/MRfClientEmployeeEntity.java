package com.redofmaple.domain;

import javax.persistence.*;

@Entity
@Table(name = "rf_client_employee", schema = "test", catalog = "")
public class MRfClientEmployeeEntity {
    private int id;
    private Integer tbUserId;
    private Integer designId;
    private Integer fundesignId;
    private Integer manageId;
    private Integer saleId;
    private Integer supervisorId;
    private Integer orderId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tb_user_id", nullable = true)
    public Integer getTbUserId() {
        return tbUserId;
    }

    public void setTbUserId(Integer tbUserId) {
        this.tbUserId = tbUserId;
    }

    @Basic
    @Column(name = "design_id", nullable = true)
    public Integer getDesignId() {
        return designId;
    }

    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    @Basic
    @Column(name = "fundesign_id", nullable = true)
    public Integer getFundesignId() {
        return fundesignId;
    }

    public void setFundesignId(Integer fundesignId) {
        this.fundesignId = fundesignId;
    }

    @Basic
    @Column(name = "manage_id", nullable = true)
    public Integer getManageId() {
        return manageId;
    }

    public void setManageId(Integer manageId) {
        this.manageId = manageId;
    }

    @Basic
    @Column(name = "sale_id", nullable = true)
    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    @Basic
    @Column(name = "supervisor_id", nullable = true)
    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    @Basic
    @Column(name = "order_id", nullable = true)
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MRfClientEmployeeEntity that = (MRfClientEmployeeEntity) o;

        if (id != that.id) return false;
        if (tbUserId != null ? !tbUserId.equals(that.tbUserId) : that.tbUserId != null) return false;
        if (designId != null ? !designId.equals(that.designId) : that.designId != null) return false;
        if (fundesignId != null ? !fundesignId.equals(that.fundesignId) : that.fundesignId != null) return false;
        if (manageId != null ? !manageId.equals(that.manageId) : that.manageId != null) return false;
        if (saleId != null ? !saleId.equals(that.saleId) : that.saleId != null) return false;
        if (supervisorId != null ? !supervisorId.equals(that.supervisorId) : that.supervisorId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tbUserId != null ? tbUserId.hashCode() : 0);
        result = 31 * result + (designId != null ? designId.hashCode() : 0);
        result = 31 * result + (fundesignId != null ? fundesignId.hashCode() : 0);
        result = 31 * result + (manageId != null ? manageId.hashCode() : 0);
        result = 31 * result + (saleId != null ? saleId.hashCode() : 0);
        result = 31 * result + (supervisorId != null ? supervisorId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
