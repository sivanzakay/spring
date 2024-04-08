package com.spring.annotations.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.locks.ReentrantLock;


public class LockService implements Runnable{

    private ReentrantLock lock = new ReentrantLock();
    private static int count = 0;

    private void accessResource(){
        lock.lock();
        try {

            System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
            count++;
        } finally {
            lock.unlock();
            System.out.println("Unloched : " + Thread.currentThread().getName() + " gets Count: " + count);
        }

    }

    @Override
    public void run() {
        accessResource();
    }
}
