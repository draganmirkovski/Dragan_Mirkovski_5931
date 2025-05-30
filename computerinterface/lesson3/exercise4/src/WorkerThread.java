public class WorkerThread implements Runnable{
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName() + "(Start) message" + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + "(End) message" + message);
    }
    public void processMessage(){
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
