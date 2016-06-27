/**
 * Created by User on 27.06.2016.
 */
public class Worker implements Runnable{
    private Message message;

    public Worker(Message m){
        this.message=m;
    }


    @Override
       public void run() {
        String name = Thread.currentThread().getName();
        synchronized (message){
            try {
                System.out.println(name + " waiting for the call notify method: " + System.currentTimeMillis());
                message.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + " challenged  notify method: " + System.currentTimeMillis());
            System.out.println(name + " : " + message.getMessage());
        }

    }
}
