package com.thecoinkarma.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.thecoinkarma.blog.entity.Category;
import com.thecoinkarma.blog.entity.Comment;
import com.thecoinkarma.blog.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
	
	private Integer postId;
	
	@NotEmpty
	@Size(min = 10, message = "Title must be min of 10 characters")
	private String title;
	
	@NotBlank
	@Size(min = 25, message="Content must be min of 25 characters")
	private String content;
	
	private String imageName;
	
	private Date addDate;	
	
	private CategoryDto category;
	
	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();
}
