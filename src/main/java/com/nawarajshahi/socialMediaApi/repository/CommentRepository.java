package com.nawarajshahi.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.nawarajshahi.socialMediaApi.entity.Comment;



public interface CommentRepository extends CrudRepository<Comment, Long> {

	

}
