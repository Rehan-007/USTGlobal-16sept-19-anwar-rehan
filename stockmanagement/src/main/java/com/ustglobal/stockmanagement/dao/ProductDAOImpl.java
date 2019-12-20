package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import com.ustglobal.stockmanagement.dto.ProductBean;

@Repository 
public class ProductDAOImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addProduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductBean pb = manager.find(ProductBean.class, bean.getPid());
			pb.setName(bean.getName());
			pb.setCategory(bean.getCategory());
			pb.setCompany(bean.getCompany());
			pb.setPrice(bean.getPrice());
			pb.setQuantity(bean.getQuantity());
			transaction.commit();
			return true;
		} catch(Exception e) {
			return false;	
		}
	}

	@Override
	public boolean deleteById(int pid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductBean pb = manager.find(ProductBean.class, pid);
			manager.remove(pb);
			transaction.commit();
			return true;
		} catch(Exception e) {
			return false;	
		}
	}
	@Override
	public ProductBean getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductBean where name=:name";
			TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
			typedQuery.setParameter("name", name);
			ProductBean product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductBean> getProductByCompanyName(String company) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductBean where company=:company";
			TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
			typedQuery.setParameter("company", company);
			return typedQuery.getResultList();
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductBean> getProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductBean where category=:category";
		TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
		typedQuery.setParameter("category", category);
		return typedQuery.getResultList();
	}

	@Override
	public List<ProductBean> getAllProduct() {
		
		EntityManager manager = factory.createEntityManager();
		String jpql = "from ProductBean";
		TypedQuery<ProductBean> typedQuery = manager.createQuery(jpql, ProductBean.class);
		return typedQuery.getResultList();
	}

	@Override
	public boolean addToCart(ProductBean bean,int itemCount) {
		
		String jpql = "Update ProductBean set quantity=:quantity-:itemCount where pid=:pid";
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ProductBean product = manager.find(ProductBean.class, bean.getPid());
		TypedQuery<ProductBean> query = manager.createQuery(jpql, ProductBean.class);
		query.setParameter("quantity", bean.getQuantity());
		query.setParameter("itemCount", bean.getQuantity());
		query.setParameter("pid", bean.getPid());
		ProductBean bean1 = query.getSingleResult();
		try {
			transaction.begin();
			product.setQuantity(bean1.getQuantity());
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
