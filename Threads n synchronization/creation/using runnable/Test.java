class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread running using Runnable");
    }
}
public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new MyTask());
        t.start();
    }
}
