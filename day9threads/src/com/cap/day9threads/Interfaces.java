package com.cap.day9threads;

interface c{
	
	int x=90;
	void cal(int item);
		
	
}

class D implements c{
	
	int x;
	public void cal(int item){
		x= item*item;
	}
}
public class Interfaces {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1= new D();
//		t d2= new t();
		d1.x=0;
		d1.cal(10);
	
		System.out.println(d1.x+""+ c.x);

	}

}
