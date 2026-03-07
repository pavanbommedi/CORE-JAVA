package Synchronize;

public class Stack {

    private int[] array;
    private int stackTop;
    Object lock;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop=-1;
        lock = new Object();
    }

    public synchronized boolean push(int x){
        //synchronized(this){  // synchronized(new Object())  //synchronized(lock)
        if(isFull()) return false;
        stackTop++;

        try {Thread.sleep(1000); } catch(Exception e){} ;
        array[stackTop]=x;
        return true;
        //}
    }

    public synchronized int pop(){
        //synchronized(this){ //synchronized(new Object())  // Same thread should lock both the method so methodsshould be bounded with same lock
        if(isEmpty()) return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop]=Integer.MIN_VALUE;

        
        try {Thread.sleep(1000); } catch(Exception e){} ;
        stackTop--;
        return obj;
        //}
    }

    public boolean isEmpty(){
        if(stackTop<0) return true;
        else return false;
    }

    public boolean isFull(){
        if(stackTop>= array.length-1) return true;
        else return false;
    }


}
