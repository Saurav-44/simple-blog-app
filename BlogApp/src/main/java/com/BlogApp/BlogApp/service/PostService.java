package com.BlogApp.BlogApp.service;

import com.BlogApp.BlogApp.entity.Post;

import java.util.List;

public interface PostService {

    public Post savePost(Post post);

    List<Post> getAllPosts();

    Post getPostId(Long postId);

    void likePost(Long postId);

    List<Post> searchByName(String name);

}
