package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.dto.ProductBean;

public interface ProductDAO {

	public boolean addProduct(ProductBean bean);
	public boolean updateProduct(ProductBean bean);
	public boolean deleteById(int pid);
	public ProductBean getProductByName(String name);
	public List<ProductBean> getProductByCompanyName(String company);
	public List<ProductBean> getProductByCategory(String category);
	public List<ProductBean> getAllProduct();
	public boolean addToCart(ProductBean bean,int itemCount);
	
}
