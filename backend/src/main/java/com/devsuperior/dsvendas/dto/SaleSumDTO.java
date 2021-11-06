package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sumAmountSale;

	public SaleSumDTO() {}

	public SaleSumDTO(Seller seller, Double sumAmountSale) {
		this.sellerName = seller.getName();
		this.sumAmountSale = sumAmountSale;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSumAmountSale() {
		return sumAmountSale;
	}

	public void setSumAmountSale(Double sumAmountSale) {
		this.sumAmountSale = sumAmountSale;
	}
	
	
}
