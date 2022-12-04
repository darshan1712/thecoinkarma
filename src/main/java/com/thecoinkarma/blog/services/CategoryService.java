package com.thecoinkarma.blog.services;

import java.util.List;

import com.thecoinkarma.blog.payloads.CategoryDto;

///Here we are not writing public as in Integer, methods are by default public and abstract

public interface CategoryService {

	//create category
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//get category
	CategoryDto getCategory(Integer categoryId);
	
	//get All Category
	List<CategoryDto> getAllCategory();
	
	//update category
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	//delete category
	void deleteCategory(Integer categoryId);
}
