package com.thecoinkarma.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thecoinkarma.blog.entity.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
