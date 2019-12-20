package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.dao.ProductDAO;
import com.ustglobal.stockmanagement.dto.ProductBean;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO dao;
	
	@Override
	public boolean addProduct(ProductBean bean) {
		return dao.addProduct(bean);
	}

	@Override
	public boolean updateProduct(ProductBean bean) {
		return dao.updateProduct(bean);
	}

	@Override
	public boolean deleteById(int id) {
		return dao.deleteById(id);
	}

	@Override
	public ProductBean getProductByName(String name) {
		return dao.getProductByName(name);
	}


	@Override
	public List<ProductBean> getProductByCategory(String category) {
		return dao.getProductByCategory(category);
	}

	@Override
	public List<ProductBean> getAllProduct() {
		return dao.getAllProduct();
	}

	@Override
	public boolean addToCart(ProductBean bean, int itemCount) {
		return dao.addToCart(bean, itemCount);
	}

	@Override
	public List<ProductBean> getProductByCompanyName(String company) {
		return dao.getProductByCompanyName(company);
	}


}
