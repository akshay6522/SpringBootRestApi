package com.productApi.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.productApi.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveProduct(Product product) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		boolean isAdded = false;

		try {

			session.save(product);
			transaction.commit();
			isAdded = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session!=null) {
				session.close();
			}
		}
		return isAdded;
	}

	@Override
	public List<Product> getAllproduct() {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		List<Product> list =null;
		
		try {
			Criteria criteria = session.createCriteria(Product.class);
			 list = criteria.list();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return list;
	}

	@Override
	public boolean updateProduct(String productId) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Product product =null;
		try {
			Criteria criteria = session.createCriteria(Product.class);
			criteria.list().set(0, criteria);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}
