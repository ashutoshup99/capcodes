package com.cap.pra;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cap.repost.AddressRepository;
import com.cap.repost.PersonRepository;
public class TestPerAdd {

	PersonRepository pr;
	AddressRepository ar;

	@Before
	public void setUp() {
		pr = new PersonRepository();
		ar = new AddressRepository(); 
	}
//	@Test
//	public void testaddAddress() {
//		Address a= new Address(123,"Up","Noida");
//		ar.addAddress(a);
//	}
//	@Test
//	public void testfindaddr() {
//		ar.findaddr(2);
//	}
//	@Test
//	public void testfindAllAddress() {
//		List<Address> a =ar.findAllAddress();
//		System.out.println(a);
//	}
//	@Test
//	public void testupdateAddress() {
//		ar.upadateAddress(1, new Address(456,"Up","Mathura"));
//	}
//	@Test
//	public void testupadateAddressCity() {
//		ar.upadateAddressCity(1, "Hadaspar");
//	}
//	@Test
//	public void testupadateHouseNumber() {
//		ar.upadateHouseNumber(1,432);
//	}
//	@Test
//	public void testupadateLocation() {
//		ar.upadateAddressLocation(4, "karnataka");
//	}
//	@Test
//	public void testfindPer() {
//		pr.findPer(1);
//	}
//	@Test
//	public void testfindAllPer() {
//		List<Person> pl=pr.findAllPerson();
//		System.out.println(pl);
//	}
//	@Test
//	public void testfindperByName() {
//		Person p2=pr.findperByName("Arjun");
//		System.out.println(p2);
//	}
//	@Test
//	public void testaddPrson() {
//		Address a1=new Address(13,"Up","mirzapur");
//		Person p1= new Person("Ramesh",a1);
//		pr.addPerson(p1);
//		Address a2=new Address(14,"MP","thane");
//		Person p2= new Person("Joyti",a2);
//		pr.addPerson(p2);
//		Address a3=new Address(15,"Up","bns");
//		Person p3= new Person("suresh",a3);
//		pr.addPerson(p3);
//		Address a4=new Address(13,"Up","thu");
//		Person p4= new Person("arvind",a4);
//		pr.addPerson(p4);
//		
//	}
//	@Test
//	public void testdeletePerson() {
//		pr.deletePerson(5);
//	}
//	@Test
//	public void testupadateName() {
//		pr.upadateName(1, "Arjun");
//	}	
	@Test
	public void testdeleteAddress() {
		ar.deleteAddress(13);
	}

}
