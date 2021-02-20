package com.cap.day8;
import java.util.ArrayList;
class Fruit{
	String name;
	String color;

	public Fruit(String name) {
		super();
		this.name = name;
	}
	
	public boolean equals(Object obj) {
			Fruit f = (Fruit) obj;
	        return (this.name.equals(f.name));
	   }

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}
	
}


public class ArrayFruit {
	public static void main(String[] args) {
//			String fruits[] = {"Apple", "Banana", "Orange"};
//			Fruit f1 = new Fruit("Apple");
//			Fruit f2 = new Fruit("Guava");
//			Fruit f3 = new 	Fruit("Banana");
//			Fruit f4 = new Fruit("Orange");
//			Fruit fa[]= {f1,f2,f3,f4};
			
			ArrayList<String> Fruitarr = new ArrayList<String>(); 
			Fruitarr.add("Apple");
			Fruitarr.add("Guava");
			Fruitarr.add("Banana");
			Fruitarr.add("Orange");
			for(String i:Fruitarr ) {
			System.out.println(i);
			}		
//			Fruit fruits[]= {f1 , new Fruit("Banana"), new Fruit("Orange")};
//			
//			
//			int result = Arrays.binarySearch(fruits, new Fruit("Orange"));
//			
//			if(result>=0 ) {
//				System.out.println("Found at: " + result);
//				System.out.println(fruits[result]);
//			}
//			else {
//				System.out.println("Not found");
//			}

			
		}
	}

