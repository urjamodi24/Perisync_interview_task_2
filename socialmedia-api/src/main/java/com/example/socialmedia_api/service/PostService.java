package com.example.socialmedia_api.service;



import com.example.socialmedia_api.model.Post;
import com.example.socialmedia_api.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> getAll() {
        return repository.findAll();
    }

    public Post getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public Post save(Post post) {
        return repository.save(post);
    }

    public Post update(Long id, Post updatedPost) {
        Post post = repository.findById(id).orElseThrow();
        post.setContent(updatedPost.getContent());
        post.setImageUrl(updatedPost.getImageUrl());
        post.setEdited(true);
        return repository.save(post);
    }

    public Post partialUpdate(Long id, String content) {
        Post post = repository.findById(id).orElseThrow();
        post.setContent(content);
        post.setEdited(true);
        return repository.save(post);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
