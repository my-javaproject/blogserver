package com.akhil.blogserver.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 5000)
    private String content;

    private String author;

    private String image;

    private Date date;

    private int likes;

    private int viewCount;

    @ElementCollection
    private List<String> tags;


}
