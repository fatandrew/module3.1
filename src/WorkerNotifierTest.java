/**
 * Created by User on 27.06.2016.
 */
public class WorkerNotifierTest {
    public static void main(String[] args) {
        Message message = new Message("processing");
        Worker worker = new Worker(message);
        new Thread(worker, "worker").start();

        Worker worker1 = new Worker(message);
        new Thread(worker1, "worker1").start();

        Notifier notifier =  new Notifier(message);
        new Thread(notifier, "notifier").start();
        System.out.println("All Threads have been started");
    }
}
