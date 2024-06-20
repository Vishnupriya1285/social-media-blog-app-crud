package com.learning.springboot.social_media_blog_app_crud.service;

import com.learning.springboot.social_media_blog_app_crud.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    List<PostDto> getAllPosts();
    PostDto getPostById(Long id);
    PostDto createPost(PostDto postDto);
    PostDto updatePostById(PostDto postDto,Long id);
    void deletePostById(Long id);
}
