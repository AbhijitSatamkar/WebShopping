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

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	// @Test
	// public void testAddCategory() {
	// category = new Category();
	//
	// category.setName("Television");
	// category.setDescription("Description for Tele from id 1");
	// category.setImageURL("cat1.png");
	//
	// assertEquals("Successfully added a category inside the
	// table!",true,categoryDAO.add(category));
	//
	// }

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(2);
	 * assertEquals("Successfully fetched a single category from table","Laptop",
	 * category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(1); category.setName("TV");
	 * assertEquals("Successfully update a single category in the table",true,
	 * categoryDAO.update(category)); }
	 */

	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * assertEquals("Successfully update a single category in the table",false,
	 * categoryDAO.delete(category)); }
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched list of categories from the table",2,
	 * categoryDAO.list().size()); }
	 */

	@Test
	public void testCRUDCategory() {
		
		/*
		 * Add the Category
		 * */

		category = new Category();

		category.setName("Television");
		category.setDescription("Description for Tele from id 1");
		category.setImageURL("cat1.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Mobile");
		category.setDescription("Description for Tele from id 2");
		category.setImageURL("cat2.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Laptop");
		category.setDescription("Description for Tele from id 3");
		category.setImageURL("cat3.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));

		category = new Category();

		category.setName("TouchPad");
		category.setDescription("Description for Tele from id 4");
		category.setImageURL("cat4.png");

		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
		
		/*
		 * Update the Category
		 * */
		category = categoryDAO.get(1); category.setName("TV");
		assertEquals("Successfully update a single category in the table",true,categoryDAO.update(category)); 
	
		/*
		 * Delete the Category
		 * */
		 assertEquals("Successfully update a single category in the table",true,categoryDAO.delete(category)); 
		 
		/*
		* Fetching the Category list
		* */		 
		 assertEquals("Successfully fetched list of categories from the table",3,categoryDAO.list().size());
	}
}
