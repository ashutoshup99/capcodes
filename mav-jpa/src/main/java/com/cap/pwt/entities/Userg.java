package com.cap.pwt.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Userg {
			
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		String email;
		String password;
		
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Userg() {
			
		}
		public Userg(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}
		@Override
		public String toString() {
			return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
		}
}
