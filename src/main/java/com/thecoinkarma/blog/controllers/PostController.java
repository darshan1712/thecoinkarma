package com.thecoinkarma.blog.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thecoinkarma.blog.config.AppConstants;
import com.thecoinkarma.blog.payloads.ApiResponse;
import com.thecoinkarma.blog.payloads.PostDto;
import com.thecoinkarma.blog.payloads.PostResponse;
import com.thecoinkarma.blog.services.PostService;

@RestController
@RequestMapping("/api")
public class PostController {
	
	@Autowired
	private PostService postService;

	//create post
	@PostMapping("/posts/user/{userId}/category/{categoryId}")
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto, @PathVariable Integer userId, @PathVariable Integer categoryId)
	{
		PostDto createPost = this.postService.createPost(postDto, userId, categoryId);
		
		return new ResponseEntity<PostDto>(createPost, HttpStatus.CREATED);
	}
	
	//getByUser
	@GetMapping("/posts/user/{userId}")
	public ResponseEntity<List<PostDto>> getPostByUser(@PathVariable Integer userId)
	{
		List<PostDto> PostDtoList = this.postService.getPostByUser(userId);
		return new ResponseEntity<List<PostDto>>(PostDtoList, HttpStatus.OK);
	}
	
	
	//getByCategory
	@GetMapping("/posts/category/{categoryId}")
	public ResponseEntity<List<PostDto>> getPostByCategory(@PathVariable Integer categoryId)
	{
		List<PostDto> PostDtoList = this.postService.getPostByCategory(categoryId);
		return new ResponseEntity<List<PostDto>>(PostDtoList, HttpStatus.OK);
	}
	
	//getAllPost
	@GetMapping("/posts")
	public ResponseEntity<PostResponse> getAllPost(
			@RequestParam(value = "pageNumber", defaultValue = AppConstants.PAGE_NUMBER, required = false) Integer pageNumber,
			@RequestParam(value = "pageSize", defaultValue = AppConstants.PAGE_SIZE, required = false) Integer pageSize,
			@RequestParam(value = "sortBy", defaultValue = AppConstants.SORT_BY, required = false) String sortBy,
			@RequestParam(value = "sortDir", defaultValue = AppConstants.SORT_DIR, required = false) String sortDir
			)
	{
		PostResponse postResponse = this.postService.getAllPost(pageNumber, pageSize, sortBy, sortDir);
		return new ResponseEntity<PostResponse>(postResponse, HttpStatus.OK);
	}
	
	//getPostById
	@GetMapping("/posts/{postId}")
	public ResponseEntity<PostDto> getPostById(@PathVariable Integer postId)
	{
		PostDto PostDto = this.postService.getPostById(postId);
		return new ResponseEntity<PostDto>(PostDto, HttpStatus.OK);
	}
	
	//deletePost
	@DeleteMapping("/posts/{postId}")
	public ResponseEntity<ApiResponse> deletePostById(@PathVariable Integer postId)
	{
		this.postService.deletePost(postId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Post deleted Successfully", true), HttpStatus.OK);
	}
	
	//update post
	@PutMapping("/posts/{postId}")
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto, @PathVariable Integer postId)
	{
		PostDto updatedPost = this.postService.updatePost(postDto, postId);
		
		return new ResponseEntity<PostDto>(updatedPost, HttpStatus.CREATED);
	}
	
	//getPostByKeyword
	@GetMapping("/posts/search/{keyword}")
	public ResponseEntity<List<PostDto>> getBySearchKeyword(@PathVariable String keyword)
	{
		List<PostDto> PostDtoList = this.postService.searchPosts(keyword);
		return new ResponseEntity<List<PostDto>>(PostDtoList, HttpStatus.OK);
	}
	
}
