package com.learning.springboot.social_media_blog_app_crud.controller;

import com.learning.springboot.social_media_blog_app_crud.dto.PostDto;
import com.learning.springboot.social_media_blog_app_crud.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api/posts")
public class PostController {
    @Autowired
    PostService postService;

    // v1/api/posts
    @GetMapping
    public List<PostDto> getAllPosts()
    {
        return postService.getAllPosts();
    }
}
