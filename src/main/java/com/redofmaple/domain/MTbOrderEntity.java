package com.redofmaple.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_order", schema = "test", catalog = "")
public class MTbOrderEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "order_number", nullable = true, length = 255)
    private String orderNumber;
    @Basic
    @Column(name = "order_source", nullable = true)
    private Integer orderSource;
    @Basic
    @Column(name = "order_total_money", nullable = true, length = 255)
    private String orderTotalMoney;
    @Basic
    @Column(name = "order_budget_money", nullable = true, length = 255)
    private String orderBudgetMoney;
    @Basic
    @Column(name = "order_type", nullable = true, length = 1)
    private String orderType;
    @Basic
    @Column(name = "user_id", nullable = true)
    private Integer userId;
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
    @Column(name = "delete_flag", nullable = true, length = 1)
    private String deleteFlag;
    @Basic
    @Column(name = "order_status", nullable = true, length = 255)
    private String orderStatus;
    @Basic
    @Column(name = "order_Dealtime", nullable = true)
    private Timestamp orderDealtime;
    @Basic
    @Column(name = "order_paymentTime", nullable = true, length = 255)
    private String orderPaymentTime;
    @Basic
    @Column(name = "order_generateTime", nullable = true)
    private Timestamp orderGenerateTime;
    @Basic
    @Column(name = "order_totalNum", nullable = true)
    private Integer orderTotalNum;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_number", nullable = true, length = 255)
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Basic
    @Column(name = "order_source", nullable = true)
    public Integer getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(Integer orderSource) {
        this.orderSource = orderSource;
    }

    @Basic
    @Column(name = "order_total_money", nullable = true, length = 255)
    public String getOrderTotalMoney() {
        return orderTotalMoney;
    }

    public void setOrderTotalMoney(String orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney;
    }

    @Basic
    @Column(name = "order_budget_money", nullable = true, length = 255)
    public String getOrderBudgetMoney() {
        return orderBudgetMoney;
    }

    public void setOrderBudgetMoney(String orderBudgetMoney) {
        this.orderBudgetMoney = orderBudgetMoney;
    }

    @Basic
    @Column(name = "order_type", nullable = true, length = 1)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    @Basic
    @Column(name = "order_status", nullable = true, length = 255)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_Dealtime", nullable = true)
    public Timestamp getOrderDealtime() {
        return orderDealtime;
    }

    public void setOrderDealtime(Timestamp orderDealtime) {
        this.orderDealtime = orderDealtime;
    }

    @Basic
    @Column(name = "order_paymentTime", nullable = true, length = 255)
    public String getOrderPaymentTime() {
        return orderPaymentTime;
    }

    public void setOrderPaymentTime(String orderPaymentTime) {
        this.orderPaymentTime = orderPaymentTime;
    }

    @Basic
    @Column(name = "order_generateTime", nullable = true)
    public Timestamp getOrderGenerateTime() {
        return orderGenerateTime;
    }

    public void setOrderGenerateTime(Timestamp orderGenerateTime) {
        this.orderGenerateTime = orderGenerateTime;
    }

    @Basic
    @Column(name = "order_totalNum", nullable = true)
    public Integer getOrderTotalNum() {
        return orderTotalNum;
    }

    public void setOrderTotalNum(Integer orderTotalNum) {
        this.orderTotalNum = orderTotalNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MTbOrderEntity that = (MTbOrderEntity) o;

        if (id != that.id) return false;
        if (orderNumber != null ? !orderNumber.equals(that.orderNumber) : that.orderNumber != null) return false;
        if (orderSource != null ? !orderSource.equals(that.orderSource) : that.orderSource != null) return false;
        if (orderTotalMoney != null ? !orderTotalMoney.equals(that.orderTotalMoney) : that.orderTotalMoney != null)
            return false;
        if (orderBudgetMoney != null ? !orderBudgetMoney.equals(that.orderBudgetMoney) : that.orderBudgetMoney != null)
            return false;
        if (orderType != null ? !orderType.equals(that.orderType) : that.orderType != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updateUser != null ? !updateUser.equals(that.updateUser) : that.updateUser != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (orderStatus != null ? !orderStatus.equals(that.orderStatus) : that.orderStatus != null) return false;
        if (orderDealtime != null ? !orderDealtime.equals(that.orderDealtime) : that.orderDealtime != null)
            return false;
        if (orderPaymentTime != null ? !orderPaymentTime.equals(that.orderPaymentTime) : that.orderPaymentTime != null)
            return false;
        if (orderGenerateTime != null ? !orderGenerateTime.equals(that.orderGenerateTime) : that.orderGenerateTime != null)
            return false;
        if (orderTotalNum != null ? !orderTotalNum.equals(that.orderTotalNum) : that.orderTotalNum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (orderSource != null ? orderSource.hashCode() : 0);
        result = 31 * result + (orderTotalMoney != null ? orderTotalMoney.hashCode() : 0);
        result = 31 * result + (orderBudgetMoney != null ? orderBudgetMoney.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUser != null ? updateUser.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (orderDealtime != null ? orderDealtime.hashCode() : 0);
        result = 31 * result + (orderPaymentTime != null ? orderPaymentTime.hashCode() : 0);
        result = 31 * result + (orderGenerateTime != null ? orderGenerateTime.hashCode() : 0);
        result = 31 * result + (orderTotalNum != null ? orderTotalNum.hashCode() : 0);
        return result;
    }
}
