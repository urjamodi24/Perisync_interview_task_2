package com.example.socialmedia_api.repository;



import com.example.socialmedia_api.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
