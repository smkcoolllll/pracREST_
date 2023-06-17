package com.store.model;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Store")
public class Store {


	@Id
	private int strId;
	
	private String strName;
	private String whatwesell;
	private String strAddress;
	private String strContact;
	private String strEmail;
	private String strOwnerName;
	
//	public Store(int strId, String strName, String whatwesell, String strAddress, String strContact, String strEmail,
//			String strOwnerName) {
//		super();
//		this.strId = strId;
//		this.strName = strName;
//		this.whatwesell = whatwesell;
//		this.strAddress = strAddress;
//		this.strContact = strContact;
//		this.strEmail = strEmail;
//		this.strOwnerName = strOwnerName;
//	}
	public int getStrId() {
		return strId;
	}
	public void setStrId(int strId) {
		this.strId = strId;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getWhatwesell() {
		return whatwesell;
	}
	public void setWhatwesell(String whatwesell) {
		this.whatwesell = whatwesell;
	}
	public String getStrAddress() {
		return strAddress;
	}
	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}
	public String getStrContact() {
		return strContact;
	}
	public void setStrContact(String strContact) {
		this.strContact = strContact;
	}
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	public String getStrOwnerName() {
		return strOwnerName;
	}
	public void setStrOwnerName(String strOwnerName) {
		this.strOwnerName = strOwnerName;
	}
	@Override
	public String toString() {
		return "Store [strId=" + strId + ", strName=" + strName + ", whatwesell=" + whatwesell + ", strAddress="
				+ strAddress + ", strContact=" + strContact + ", strEmail=" + strEmail + ", strOwnerName="
				+ strOwnerName + "]";
	}
	
	
}
