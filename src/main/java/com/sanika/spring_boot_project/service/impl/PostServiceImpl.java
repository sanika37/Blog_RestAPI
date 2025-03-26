package com.sanika.spring_boot_project.service.impl;

import com.sanika.spring_boot_project.entity.Post;
import com.sanika.spring_boot_project.exception.ResourceNotFoundException;
import com.sanika.spring_boot_project.repository.PostRepository;
import com.sanika.spring_boot_project.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        Post post = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        return post;
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post updatePost(Long id, Post post) {
        Post savePost = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        savePost.setTitle(post.getTitle());
        savePost.setDescription(post.getDescription());
        savePost.setContent(post.getContent());
        return postRepository.save(savePost);
    }

    @Override
    public void deletePost(Long id) {
        Post post = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("post", "postId", id));
        postRepository.delete(post);
    }
}
