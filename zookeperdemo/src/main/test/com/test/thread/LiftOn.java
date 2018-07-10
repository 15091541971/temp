package com.test.thread;

public class LiftOn implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 30000; i++) {
			System.out.println("on");
		}
		System.out.println("runing..........................on");
	}

}
