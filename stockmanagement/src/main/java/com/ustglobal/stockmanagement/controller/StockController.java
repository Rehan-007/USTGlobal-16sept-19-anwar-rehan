package com.ustglobal.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.dto.ProductBean;
import com.ustglobal.stockmanagement.dto.ProductResponse;
import com.ustglobal.stockmanagement.service.ProductService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
public class StockController {

	@Autowired
	private ProductService service;
	
	@PostMapping(path="/add",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse resp = new ProductResponse();
		if(service.addProduct(bean)) {
			resp.setStatuscode(200);
			resp.setMessage("Product Added");
			resp.setDescription("Product Has Been Added");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Added");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	@PutMapping(path="/update",consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse updateProduct(@RequestBody ProductBean bean) {
		ProductResponse resp = new ProductResponse();
		if(service.updateProduct(bean)) {
			resp.setStatuscode(200);
			resp.setMessage("Product Updated");
			resp.setDescription("Product Has Been Updated");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Updated");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	
	@DeleteMapping(path="/delete/{pid}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("pid") int pid) {
		ProductResponse resp = new ProductResponse();
		if(service.deleteById(pid)) {
			resp.setStatuscode(200);
			resp.setMessage("Product Deleted");
			resp.setDescription("Product Has Been Deleted");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Deleted");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	
	@GetMapping(path="/byname",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getByName(@RequestParam("name") String name) {
		ProductResponse resp = new ProductResponse();
		ProductBean bean = service.getProductByName(name);
		if(bean != null) {
			resp.setStatuscode(200);
			resp.setMessage("Product Found");
			resp.setDescription("Product Has Been Found");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Found");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	@GetMapping(path="/company",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getByCompanyName(@RequestParam("company") String company) {
		ProductResponse resp = new ProductResponse();
		List<ProductBean> bean = service.getProductByCompanyName(company);
		if(bean != null) {
			resp.setStatuscode(200);
			resp.setMessage("Product Found");
			resp.setDescription("Product Has Been Found");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Found");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	
	@GetMapping(path="/category",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getByCategory(@RequestParam("category") String category) {
		ProductResponse resp = new ProductResponse();
		List<ProductBean> bean = service.getProductByCategory(category);
		if(bean != null) {
			resp.setStatuscode(200);
			resp.setMessage("Product Found");
			resp.setDescription("Product Has Been Found");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Found");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	
	@GetMapping(path="/getall",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getAllProduct() {
		ProductResponse resp = new ProductResponse();
		List<ProductBean> bean = service.getAllProduct();
		if(bean != null) {
			resp.setStatuscode(200);
			resp.setMessage("All Product Found");
			resp.setDescription("All Product Has Been Found");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product not Found");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}

	@GetMapping(path="/addtocart",produces=MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addToCart(@RequestBody ProductBean bean,@RequestParam("itemCount") int itemCount) {
		ProductResponse resp = new ProductResponse();
		if(service.addToCart(bean, itemCount)) {
			resp.setStatuscode(200);
			resp.setMessage("Product Add To Cart");
			resp.setDescription("Product Has Been Add To Cart");
		} else {
			resp.setStatuscode(404);
			resp.setMessage("Product Not Add To Cart");
			resp.setDescription("Something Went Wrong");
		}
		return resp;
	}
	
}
