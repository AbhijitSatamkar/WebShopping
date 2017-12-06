package com.abhi.webshopbkd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.abhi.webshopbkd.dao.ProductDAO;
import com.abhi.webshopbkd.dto.Category;
import com.abhi.webshopbkd.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	//Get Single Product
	@Override
	public Product get(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(productId));
	}

	@Override
	public boolean add(Product product) {
		try {
			//add product to database table
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Product product) {
		try {
			//Update product from database table
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Product product) {
		product.setActive(false);
		try {
			//delete product from database table
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Product> list() {
		String selectActiveProducts = "FROM Product";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProducts);

		return query.getResultList();
	}

	@Override
	public List<Product> listActiveProducts() {
		String selectActiveProducts = "FROM Product  WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProducts);
		
		query.setParameter("active", true);

		return query.getResultList();
	}

	@Override
	public List<Product> listActiveProductsByCategory(int categoryId) {
		String selectActiveProductByCategory = "FROM Product  WHERE active = :active AND categoryId = :categoryId";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProductByCategory);
		
		query.setParameter("active", true).setParameter("categoryId", categoryId);

		return query.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Product WHERE active = :active Order by id",Product.class)
						.setParameter("active", true)
							.setFirstResult(0)
								.setMaxResults(count)
									.getResultList();
	}

}
