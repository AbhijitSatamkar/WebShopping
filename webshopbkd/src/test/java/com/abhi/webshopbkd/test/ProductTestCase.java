//package com.abhi.webshopbkd.test;
//
//import static org.junit.Assert.assertEquals;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.abhi.webshopbkd.dao.ProductDAO;
//import com.abhi.webshopbkd.dto.Product;
//
//public class ProductTestCase {
//
//	private static AnnotationConfigApplicationContext context;
//
//	private static ProductDAO productDAO;
//
//	private Product product;
//
////	@BeforeClass
////	public static void init() {
////
////		context = new AnnotationConfigApplicationContext();
////		context.scan("com.abhi.webshopbkd");
////		context.refresh();
////
////		productDAO = (ProductDAO) context.getBean("productDAO");
////	}
//
//	// @Test
//	// public void testAddProduct() {
//	// Product = new Product();
//	//
//	// Product.setName("Television");
//	// Product.setDescription("Description for Tele from id 1");
//	// Product.setImageURL("cat1.png");
//	//
//	// assertEquals("Successfully added a Product inside the
//	// table!",true,ProductDAO.add(Product));
//	//
//	// }
//
//	/*
//	 * @Test public void testGetProduct() {
//	 * 
//	 * Product = ProductDAO.get(2);
//	 * assertEquals("Successfully fetched a single Product from table","Laptop",
//	 * Product.getName()); }
//	 */
//
//	/*
//	 * @Test public void testUpdateProduct() {
//	 * 
//	 * Product = ProductDAO.get(1); Product.setName("TV");
//	 * assertEquals("Successfully update a single Product in the table",true,
//	 * ProductDAO.update(Product)); }
//	 */
//
//	/*
//	 * @Test public void testDeleteProduct() {
//	 * 
//	 * Product = ProductDAO.get(1);
//	 * assertEquals("Successfully update a single Product in the table",false,
//	 * ProductDAO.delete(Product)); }
//	 */
//
//	/*
//	 * @Test public void testListProduct() {
//	 * 
//	 * assertEquals("Successfully fetched list of categories from the table",2,
//	 * ProductDAO.list().size()); }
//	 */
////	@Test
////	public void testCRUDProduct() {
////
////		
////		 //Add the Product
////		 
////
////		product = new Product();
////
////		product.setName("Moto Moto");
////		product.setBrand("MOTO");
////		product.setDescription("Motrola Mobile");
////		product.setUnitPrice(120);
////		product.setActive(true);
////		product.setCategoryId(3);
////		product.setSupplierId(3);
////
////		assertEquals("Something went wrong while inserting new product!", true, productDAO.add(product));
////
////		product = new Product();
////
////		product.setName("Samsung Galaxy S4");
////		product.setBrand("Samsung");
////		product.setDescription("Samsung Mobile");
////		product.setUnitPrice(520);
////		product.setActive(true);
////		product.setCategoryId(3);
////		product.setSupplierId(3);
////		assertEquals("Something went wrong while inserting new product!", true, productDAO.add(product));
////		
////		 //Update the Product
////		product = productDAO.get(3);
////		product.setActive(false);
////		assertEquals("Something went wrong while updating the product!", true, productDAO.update(product));
////		
////		 //Delete the Product
////		assertEquals("Something went wrong while deleting the product!", true, productDAO.delete(product));
////		
////		 //Fetching the Product list
////		assertEquals("Something went wrong while fetching the products!", 7, productDAO.list().size());
////		
////		//Fetching the active Product list
////		assertEquals("Something went wrong while fetching the active products!", 5, productDAO.listActiveProducts().size());
////		
////		//Fetching the active Product by Category
////		assertEquals("Something went wrong while fetching the active products!", 3, productDAO.listActiveProductsByCategory(3).size());
////		
////		//Fetching the active Product by count
////		assertEquals("Something went wrong while fetching the products by count!", 4, productDAO.getLatestActiveProducts(4).size());
////
////	}
//
//}
