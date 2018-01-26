package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
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

}
