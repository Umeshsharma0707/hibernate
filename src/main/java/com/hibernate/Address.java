package com.hibernate;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "employee_address")
public class Address {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int addressId;
		private String street;
		private String city;
		private long zipCode;
		@Temporal(TemporalType.DATE) // only adds date
		private Date addedDate;
		
		@Lob // indicates it will be a large object
		private byte[] image;
		
		public Address(String street, String city, long zipCode, Date addedDate, byte[] image) {
			super();
			this.street = street;
			this.city = city;
			this.zipCode = zipCode;
			this.addedDate = addedDate;
			this.image = image;
		}
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public byte[] getImage() {
			return image;
		}
		public void setImage(byte[] image) {
			this.image = image;
		}
		public int getAddressId() {
			return addressId;
		}
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public long getZipCode() {
			return zipCode;
		}
		public void setZipCode(long zipCode) {
			this.zipCode = zipCode;
		}
		public Date getAddedDate() {
			return addedDate;
		}
		public void setAddedDate(Date addedDate) {
			this.addedDate = addedDate;
		}
		
		
}
