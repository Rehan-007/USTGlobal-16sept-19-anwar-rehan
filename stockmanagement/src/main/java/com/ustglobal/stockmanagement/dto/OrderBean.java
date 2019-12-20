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
@Table(name="order_info")
public class OrderBean {

	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private double totalprice;
	@Column
	private double pricewithgst;
	
	@ManyToMany
	private List<ProductBean> product;
}
