package threads.example4;

public class main {
    public static void main(String[] args) {
        Person p1 = new Person("Vali");
        Person p2 = new Person("Dani");

        Thread thread1 = new Thread(p1);
        Thread thread2 = new Thread(p2);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
