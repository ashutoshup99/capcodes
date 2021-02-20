package com.cap.pra;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

@Entity
public class Person {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String name;
		
		@OneToOne(cascade = CascadeType.ALL)
		private Address address;
		
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		//		public int getId() {
//			return id;
//		}
//		public void setId(int id) {
//			this.id = id;
//		}
		
		
		public Person() {
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Person(String name,Address address) {
			super();
//			this.id = id;
//			this.perFirstName = perFirstName;
			this.name = name;
			this.address=address;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", address="
					+ address + "]";
		}
		
}
