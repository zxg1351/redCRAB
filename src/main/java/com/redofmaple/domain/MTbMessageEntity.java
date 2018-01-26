package com.redofmaple.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "tb_message", schema = "test", catalog = "")
public class MTbMessageEntity {
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "receiver", nullable = true, length = 255)
    private String receiver;
    @Basic
    @Column(name = "create_user", nullable = true, length = 36)
    private String createUser;
    @Basic
    @Column(name = "create_time", nullable = true)
    private Timestamp createTime;
    @Basic
    @Column(name = "sender", nullable = true, length = 255)
    private String sender;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "content", nullable = true, length = 255)
    private String content;
    @Basic
    @Column(name = "sent_time", nullable = true)
    private Timestamp sentTime;
    @Basic
    @Column(name = "title", nullable = true, length = 255)
    private String title;
    @Basic
    @Column(name = "type", nullable = true, length = 255)
    private String type;

}
