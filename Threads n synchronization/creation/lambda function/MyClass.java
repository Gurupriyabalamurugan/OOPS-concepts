public class MyClass {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Thread using lambda");
        });
        t.start();
    }
}
