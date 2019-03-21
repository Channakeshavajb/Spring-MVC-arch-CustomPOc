package com.xworkz.custom.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.xworkz.custom.constants.ApplicationCanstants;
import com.xworkz.custom.controller.ItemDeclarationController;

public class ItemDeclarationDTO implements Serializable{
	
	private String customerName;
	private String customerType;
	private String itemType;
	private String importedFrom;
	private int quantity;
	@DateTimeFormat(pattern =ApplicationCanstants.DATE_FORMATE)
	private Date dateOfArrival;
	
	public ItemDeclarationDTO() {
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
		return "ItemDeclarationDTO [customerName=" + customerName + ", customerType=" + customerType + ", itemType="
				+ itemType + ", importedFrom=" + importedFrom + ", quantity=" + quantity + ", dateOfArrival="
				+ dateOfArrival + ", getCustomerName()=" + getCustomerName() + ", getCustomerType()="
				+ getCustomerType() + ", getItemType()=" + getItemType() + ", getImportedFrom()=" + getImportedFrom()
				+ ", getQuantity()=" + getQuantity() + ", getDateOfArrival()=" + getDateOfArrival() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

	
}
