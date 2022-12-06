package com.thecoinkarma.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thecoinkarma.blog.entity.Category;
import com.thecoinkarma.blog.entity.Post;
import com.thecoinkarma.blog.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	//this are customFinderMethod
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category  category);
	
}
