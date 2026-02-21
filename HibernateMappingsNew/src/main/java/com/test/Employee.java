package com.test;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		private String e_name;
		
		private String e_cmp;
		
		@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
		private Address address;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getE_name() {
			return e_name;
		}

		public void setE_name(String e_name) {
			this.e_name = e_name;
		}

		public String getE_cmp() {
			return e_cmp;
		}

		public void setE_cmp(String e_cmp) {
			this.e_cmp = e_cmp;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", e_name=" + e_name + ", e_cmp=" + e_cmp + ", address=" + address + "]";
		}
		
}
