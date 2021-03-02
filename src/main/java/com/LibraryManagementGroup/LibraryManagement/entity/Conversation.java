package com.LibraryManagementGroup.LibraryManagement.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Setter
@Getter
@Entity
@Table(name = "conversation")
public class Conversation {
    @Id
    @GeneratedValue
    @Column(unique = true)
    private Integer id;

    @Column(name = "last_message",length = 1000)
    private String lastMessage;

    @Column(name = "is_read")
    private Boolean isRead;

    @Column(name = "delete_at")
    private String deteleAt;

    @Column(name = "create_at")
    private String createAt;
}
