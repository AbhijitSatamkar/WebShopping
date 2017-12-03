package com.abhi.webshopbkd.dao;

import java.util.List;

import com.abhi.webshopbkd.dto.Category;

public interface CategoryDAO {
	
	boolean add(Category category);

	List<Category> list();
	Category get(int id);
}
