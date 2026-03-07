package BlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

    private Queue<Integer> q;
    private int capacity ;

    public BlockingQueue(int cap){
        q= new LinkedList<>();
        capacity = cap;
    }

    public boolean add(int element){
        synchronized(q){
        while(q.size()==capacity){
            try {q.wait();} catch(InterruptedException e){ };

        }
        q.add(element);
        q.notifyAll();
        return true;
    }
    }
    public boolean remove(){
        synchronized(q){
        while(q.size()==0){
            try { q.wait();} catch(InterruptedException e){};

        }
        q.poll();
        q.notifyAll();
        return true;

    }
}

}
