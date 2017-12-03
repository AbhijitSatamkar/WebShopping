package com.abhi.webshopbkd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abhi.webshopbkd.dao.CategoryDAO;
import com.abhi.webshopbkd.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.abhi.webshopbkd");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		category = new Category();
		
		category.setName("Television");
		category.setDescription("Description for Tele from id 1");
		category.setImageURL("cat1.png");
		
		assertEquals("Successfully added a category inside the table!",true,categoryDAO.add(category));
		
	}
	

}
