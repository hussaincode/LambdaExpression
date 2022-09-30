package work;

public class ThreadDemo {
    public static void main(String[] args) {

        //First Thread : Thread John
        Runnable thread1=()->{
            //this is body of thread
            //stuff
            for (int i=0;i<10;i++){
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t=new Thread(thread1);
        t.setName("JOHN");
        t.start();

    }
}
