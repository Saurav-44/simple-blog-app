package com.BlogApp.BlogApp.service;

import com.BlogApp.BlogApp.entity.Comment;

import java.util.List;

public interface CommentService {

    Comment createComment(Long postId, String postedBy, String content);

    List<Comment> getCommentByPostId(Long postId);



}
