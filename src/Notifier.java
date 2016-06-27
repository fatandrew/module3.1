/**
 * Created by User on 27.06.2016.
 */
public class Notifier implements Runnable {
    private Message message;
    public Notifier(Message message){
        this.message=message;
    }


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " starting");
        try{
            Thread.sleep(100);
            synchronized (message){
                message.setMessage(name + " a Stream Notifier had worked");
                message.notify();
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
