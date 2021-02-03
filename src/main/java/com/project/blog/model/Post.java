package com.project.blog.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length=1000000)
    @Lob
    private String body;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date date;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
}
