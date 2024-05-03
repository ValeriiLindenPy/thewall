package com.wall.thewall.Model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "app_message")
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "wall_id")
    @JsonIgnore
    private Wall wall;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    private String message;
    private Date lastEditedDate;
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date creationDate;
    
    @PrePersist
    protected void onCreate() {
        creationDate = new Date();
    }
}
