package com.thecoinkarma.blog.services;

import java.util.List;

import com.thecoinkarma.blog.entity.Post;
import com.thecoinkarma.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//Delete
	void deletePost(Integer postId);
	
	//getAll
	List<PostDto> getAllPost();
	
	//get
	PostDto getPostById(Integer postId);
	
	//getByCategory
	List<PostDto> getPostByCategory(Integer categoryId);
	
	//getPostByUserID
	List<PostDto> getPostByUser(Integer userId);
	
	//Search Post
	List<PostDto> searchPosts(String keyword);
}
