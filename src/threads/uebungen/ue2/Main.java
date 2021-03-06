package threads.uebungen.ue2;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        t1.start();
        t2.start();

        System.out.println("Drücken Sie eine Taste um zu stoppen...");
        ConsoleHelper.readline();

        w1.requestShutDown();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}
