package com.abhi.webshopbkd.dao;

import java.util.List;

import com.abhi.webshopbkd.dto.Category;

public interface CategoryDAO {


	Category get(int categoryId);
	boolean add(Category category);
	boolean update(Category category);
	boolean delete(Category category);
	List<Category> list();
}
