package com.sofkau.relationaldb.controller;

import com.sofkau.relationaldb.entity.Comment;
import com.sofkau.relationaldb.entity.Post;
import com.sofkau.relationaldb.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping()
    public List<Post> getAllPost() {
        return postService.findAllPosts();
    }

    @PostMapping("create/post")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }

    @PostMapping("create/comment")
    public Post createComment(@RequestBody Comment comment) {
        return postService.createComment(comment);
    }

    @DeleteMapping("delete/comment")
    public void deleteComment(@RequestBody Comment comment) {
        postService.deleteComment(comment);
    }

    @DeleteMapping("delete/post")
    public void deletePost(@RequestBody Post post) {
        postService.deletePost(post);
    }

}
