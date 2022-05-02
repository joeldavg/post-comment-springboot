package com.sofkau.relationaldb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Comment")
@Table(name = "comment")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String message;

    private Long fkPostId;

}
