package com.thecoinkarma.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thecoinkarma.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
