package com.cap.day9;
class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("going to be run by a thread: " + Thread.currentThread().getName());
	}
	
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = new MyRunnable();
		Thread t = new Thread(runnable);
		// start the thread
		t.start();
		
		Thread t1 = new Thread(runnable);
		// start the thread
		t1.start();
		
		System.out.println("going to be run by main thread: " + Thread.currentThread().getName() );
	}

}
