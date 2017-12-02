package com.abhi.webshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.abhi.webshopbkd.dao.CategoryDAO;
import com.abhi.webshopbkd.dto.Category;

@Controller
public class pagecontroller {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		// passing the list of cateories
		mv.addObject("categories", categoryDAO.list());

		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/*
	 * Methods  to load all the products based on category
	 */
	
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts() {
		
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProducts", true);
		// passing the list of cateories
		mv.addObject("categories", categoryDAO.list());

		return mv;
	}
	
	@RequestMapping(value = {"/show/category/{id}/products"})
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		
		ModelAndView mv=new ModelAndView("page");
		
		//Category DAO to fetch Single Category
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		// passing the list of cateories
		mv.addObject("categories", categoryDAO.list());
		// passing the single of cateory
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
}
