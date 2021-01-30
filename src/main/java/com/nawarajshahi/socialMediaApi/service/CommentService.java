package com.nawarajshahi.socialMediaApi.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nawarajshahi.socialMediaApi.entity.Comment;
import com.nawarajshahi.socialMediaApi.entity.Post;
import com.nawarajshahi.socialMediaApi.entity.User;
import com.nawarajshahi.socialMediaApi.repository.CommentRepository;
import com.nawarajshahi.socialMediaApi.repository.PostRepository;
import com.nawarajshahi.socialMediaApi.repository.UserRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository repo;
	
	@Autowired
	private PostRepository postRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	public Comment createComment(Comment comment, Long userId, Long postId) throws Exception{
		User user = userRepo.findOne(userId);
		Post post = postRepo.findOne(postId);
		if(user == null || post == null) {
			throw new Exception("user or post does not exist.");
		}
		comment.setDate((java.sql.Date) new Date());
		comment.setUser(user);
		comment.setPost(post);
		return repo.save(comment);
	}
	
	
	public void deleteComment(Long commentId) {
		repo.delete(commentId);
	}
	
}
