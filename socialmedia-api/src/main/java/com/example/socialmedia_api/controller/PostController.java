package com.example.socialmedia_api.controller;



import com.example.socialmedia_api.model.Post;
import com.example.socialmedia_api.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return ResponseEntity.ok(service.save(post));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post updatedPost) {
        return ResponseEntity.ok(service.update(id, updatedPost));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Post> partialUpdatePost(@PathVariable Long id, @RequestBody String content) {
        return ResponseEntity.ok(service.partialUpdate(id, content));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok("Post deleted");
    }
}
