package com.test.thread;

public class LiftOff implements Runnable{
    private String name;
    
	public LiftOff(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 200; i++) {
			System.out.println(name);
		}
		System.out.println("runing..........................off");
	}
   
}
