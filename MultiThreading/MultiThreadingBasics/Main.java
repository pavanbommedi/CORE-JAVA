public class Main{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts running");
        Thread1 thread1 = new Thread1("Thread1");
        // thread1.setDaemon(true);
        thread1.start();

        Thread2 thread2 =  new Thread2(); //Runnable
        Thread t2 = new Thread(thread2); //Wrapping runnable thread in Threas
        t2.start();
        t2.join();  //Join will block the exceution of main thread and lets the current complete its excecution and mains resumes
        
        //creating deadlock
        String lock1 = "pavan";
        String lock2 = "bommedi";
        Thread t1 = new Thread(()->{
            synchronized(lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            synchronized(lock2){
                System.out.println("lock 2 acquired");
            }
        }

        });

        Thread t3 = new Thread(()->{
            synchronized(lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    
            synchronized(lock1){
                System.out.println("lock 1 acquired");
            }
        }

        });
        t1.start(); t3.start();



        System.out.println("Main completed execution");

        // Thread thread3 = new Thread(()->{
        //     try{
        //         Thread.sleep(1);
        //         for(int i=0;i<10000;i++);

        //     } catch(InterruptedException e){};


        // });

        // while(true){
        //     Thread.State state = thread3.getState();
        //     System.out.println(state);
        //     if(state == Thread.State.TERMINATED){
        //         break;
        //     }
        // }
    }
}