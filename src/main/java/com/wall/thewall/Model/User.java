package com.wall.thewall.Model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "app_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "author")
    private List<Wall> walls;
    private Date registrationDate;
    
}
