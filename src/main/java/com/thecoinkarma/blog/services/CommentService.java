package com.thecoinkarma.blog.services;

import com.thecoinkarma.blog.payloads.CommentDto;

public interface CommentService {
	
	void deleteComment(Integer commentId);

	CommentDto createComment(CommentDto comment, Integer postId, Integer userId);
}
