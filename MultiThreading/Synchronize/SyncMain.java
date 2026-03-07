package Synchronize;

public class SyncMain {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        new Thread(()->{
        int counter = 0;
        while(++counter < 10){
            System.out.println("pushing into stack "+stack.push(100));
        } },"pusher"
    ).start();

    new Thread( () -> {
        int counter =0;
        while(++counter < 10){
            System.out.println("poping from stack "+stack.pop());
        }
    },"poper").start();

        
    }
}

