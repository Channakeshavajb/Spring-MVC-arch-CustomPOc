package com.xworkz.custom.entity;

import java.io.Serializable;
import java.util.Date;

public class ItemDeclarationEntity implements Serializable{

	private String customerName;
	private String customerType;
	private String itemType;
	private String importedFrom;
	private int quantity;
	private Date dateOfArrival;
	
	public ItemDeclarationEntity() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getImportedFrom() {
		return importedFrom;
	}

	public void setImportedFrom(String importedFrom) {
		this.importedFrom = importedFrom;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDateOfArrival() {
		return dateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}

	@Override
	public String toString() {
		return "ItemDeclarationEntity [customerName=" + customerName + ", customerType=" + customerType + ", itemType="
				+ itemType + ", importedFrom=" + importedFrom + ", quantity=" + quantity + ", dateOfArrival="
				+ dateOfArrival + "]";
	}
	
	
	
}
