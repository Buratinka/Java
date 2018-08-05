package com.javarush.task.task26.task2612;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/* 
Весь мир играет комедию
*/
public class Solution {
    private Lock lock = new ReentrantLock();

    public void someMethod() throws InterruptedException {


            if (lock.tryLock() == false)
            {
                ifLockIsBusy();
            }
            else
                {
                    try {
                        ifLockIsFree();
                    }finally {
                        lock.unlock();
                    }
            }
        //implement logic here, use the lock field
    }

    public void ifLockIsFree() {
    }

    public void ifLockIsBusy() {
    }
}
