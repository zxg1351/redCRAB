package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rf_client_employee", schema = "test", catalog = "")
public class MRfClientEmployeeEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "tb_user_id", nullable = true)
    private Integer tbUserId;
    @Basic
    @Column(name = "design_id", nullable = true)
    private Integer designId;
    @Basic
    @Column(name = "fundesign_id", nullable = true)
    private Integer fundesignId;
    @Basic
    @Column(name = "manage_id", nullable = true)
    private Integer manageId;
    @Basic
    @Column(name = "sale_id", nullable = true)
    private Integer saleId;
    @Basic
    @Column(name = "supervisor_id", nullable = true)
    private Integer supervisorId;
    @Basic
    @Column(name = "order_id", nullable = true)
    private Integer orderId;

}
