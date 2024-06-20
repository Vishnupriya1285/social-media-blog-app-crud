package com.learning.springboot.social_media_blog_app_crud.service.impl;

import com.learning.springboot.social_media_blog_app_crud.dto.PostDto;
import com.learning.springboot.social_media_blog_app_crud.model.PostEntity;
import com.learning.springboot.social_media_blog_app_crud.repository.PostRepository;
import com.learning.springboot.social_media_blog_app_crud.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Override
    public List<PostDto> getAllPosts() {
        List<PostEntity> postEntities=postRepository.findAll();

        //Map (or convert) PostEntity to PostDto
        if(postEntities!=null)
            return postEntities.stream()
                .map(postEntity->mapEntityToDto(postEntity)).collect(Collectors.toList());

        return List.of();
    }

    private PostDto mapEntityToDto(PostEntity postEntity) {
        PostDto postDto=new PostDto();
        postDto.setId(postEntity.getId());
        postDto.setTitle(postEntity.getTitle());
        postDto.setDescription(postEntity.getDescription());
        postDto.setContent(postEntity.getContent());
        return postDto;
    }

    @Override
    public PostDto getPostById(Long id) {
        return null;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }

    @Override
    public PostDto updatePostById(PostDto postDto, Long id) {
        return null;
    }

    @Override
    public void deletePostById(Long id) {

    }
}
