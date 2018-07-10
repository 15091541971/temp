package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMain {
public static void main(String[] args) {
ExecutorService service=Executors.newCachedThreadPool();
service.submit(new LiftOff("454"));
service.submit(new LiftOff("789"));
}
}
