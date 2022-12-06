package com.thecoinkarma.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.thecoinkarma.blog.entity.Category;
import com.thecoinkarma.blog.entity.Post;
import com.thecoinkarma.blog.entity.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	//this are customFinderMethod
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category  category);
	
	List<Post> findByTitleContaining(String title);
	
	//same as above findByTitleContaining(String title);
//	@Query("select p from Post p where p.title like :key")
//	List<Post> searchByTitle(@Param("key") String title);
	
}
