// Ejemplo vulnerable: Condición de carrera
public class RaceConditionExample implements Runnable {
    private static int count = 0;
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count++; // sin sincronización
        }
    }
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new RaceConditionExample());
        Thread t2 = new Thread(new RaceConditionExample());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count: " + count);
    }
}
