package com.learning.springboot.social_media_blog_app_crud.repository;

import com.learning.springboot.social_media_blog_app_crud.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {

}
