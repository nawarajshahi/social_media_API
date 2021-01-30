package com.nawarajshahi.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.nawarajshahi.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
