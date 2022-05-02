package com.sofkau.relationaldb.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Post")
@Table(name = "post")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String message;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Comment> comments = new ArrayList<>();

    public Post addComment(Comment comment) {
        this.comments.add(comment);
        return this;
    }

}
