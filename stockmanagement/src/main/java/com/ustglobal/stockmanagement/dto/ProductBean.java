package com.ustglobal.stockmanagement.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product_info")
public class ProductBean {

	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
	
	@ManyToMany(mappedBy="product")
	private List<OrderBean> order;
	
}
