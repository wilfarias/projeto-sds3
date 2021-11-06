package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{

private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long totalVisited;
	private Long totalDeals;

	public SaleSuccessDTO() {}

	public SaleSuccessDTO(Seller seller, Long totalVisited, Long totalDeals) {
		this.sellerName = seller.getName();
		this.totalVisited = totalVisited;
		this.totalDeals = totalDeals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getTotalVisited() {
		return totalVisited;
	}

	public void setTotalVisited(Long totalVisited) {
		this.totalVisited = totalVisited;
	}

	public Long getTotalDeals() {
		return totalDeals;
	}

	public void setTotalDeals(Long totalDeals) {
		this.totalDeals = totalDeals;
	}
}
