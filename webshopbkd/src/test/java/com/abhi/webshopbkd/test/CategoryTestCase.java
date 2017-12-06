//package com.abhi.webshopbkd.test;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.abhi.webshopbkd.dao.CategoryDAO;
//import com.abhi.webshopbkd.dto.Category;
//
//public class CategoryTestCase {
//
//	private static AnnotationConfigApplicationContext context;
//
//	private static CategoryDAO categoryDAO;
//
//	private Category category;
//
//	@BeforeClass
//	public static void init() {
//
//		context = new AnnotationConfigApplicationContext();
//		context.scan("com.abhi.webshopbkd");
//		context.refresh();
//
//		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
//	}
//
//	// @Test
//	// public void testAddCategory() {
//	// category = new Category();
//	//
//	// category.setName("Television");
//	// category.setDescription("Description for Tele from id 1");
//	// category.setImageURL("cat1.png");
//	//
//	// assertEquals("Something went wrong while inserting new inserting
//	// category!",true,categoryDAO.add(category));
//	//
//	// }
//
//	/*
//	 * @Test public void testGetCategory() {
//	 * 
//	 * category = categoryDAO.get(2);
//	 * assertEquals("Successfully fetched a single category from table","Laptop",
//	 * category.getName()); }
//	 */
//
//	/*
//	 * @Test public void testUpdateCategory() {
//	 * 
//	 * category = categoryDAO.get(1); category.setName("TV");
//	 * assertEquals("Something went wrong while updating Category",true,
//	 * categoryDAO.update(category)); }
//	 */
//
//	/*
//	 * @Test public void testDeleteCategory() {
//	 * 
//	 * category = categoryDAO.get(1);
//	 * assertEquals("Something went wrong while deleting Category",false,
//	 * categoryDAO.delete(category)); }
//	 */
//
//	/*
//	 * @Test public void testListCategory() {
//	 * 
//	 * assertEquals("Something went wrong while fetching Category",2,
//	 * categoryDAO.list().size()); }
//	 */
//
//	@Test
//	public void testCRUDCategory() {
//		
//		/*
//		 * Add the Category
//		 * */
//
//		category = new Category();
//
//		category.setName("Television");
//		category.setDescription("Description for Tele from id 1");
//		category.setImageURL("cat1.png");
//
//		assertEquals("Something went wrong while inserting new inserting!", true, categoryDAO.add(category));
//
//		category = new Category();
//
//		category.setName("Mobile");
//		category.setDescription("Description for Tele from id 2");
//		category.setImageURL("cat2.png");
//
//		assertEquals("Something went wrong while inserting new Category!", true, categoryDAO.add(category));
//
//		category = new Category();
//
//		category.setName("Laptop");
//		category.setDescription("Description for Tele from id 3");
//		category.setImageURL("cat3.png");
//
//		assertEquals("Something went wrong while inserting new inserting!", true, categoryDAO.add(category));
//
//		category = new Category();
//
//		category.setName("TouchPad");
//		category.setDescription("Description for Tele from id 4");
//		category.setImageURL("cat4.png");
//
//		assertEquals("Something went wrong while inserting new Category!", true, categoryDAO.add(category));
//		
//		
//		/*
//		 * Update the Category
//		 * */
//		category = categoryDAO.get(1); category.setName("TV");
//		assertEquals("Something went wrong while updating new Category",true,categoryDAO.update(category)); 
//	
//		/*
//		 * Delete the Category
//		 * */
//		 assertEquals("Something went wrong while deleting new Category",true,categoryDAO.delete(category)); 
//		 
//		/*
//		* Fetching the Category list
//		* */		 
//		 assertEquals("Something went wrong while fetching new Category",3,categoryDAO.list().size());
//		 
//	}
//}
