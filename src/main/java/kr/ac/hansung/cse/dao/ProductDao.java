package kr.ac.hansung.cse.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.cse.model.Product;

@Repository
@Transactional
public class ProductDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private SessionFactory sessionFactory;

	public Product getProductById(int id) {

		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);

		return product;

	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Product");
		List<Product> productList = query.list();

		return productList;

	}

	public void addProduct(Product product) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();

	}

	public void deleteProduct(Product product) {

		Session session = sessionFactory.getCurrentSession();
		session.delete(product);
		session.flush();

	}

	public void updateProduct(Product product) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();

	}
}
