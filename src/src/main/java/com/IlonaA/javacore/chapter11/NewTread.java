package src.main.java.com.IlonaA.javacore.chapter11;
//создать второй поток исполнения
public class NewTread implements Runnable{
    Thread t;
    NewTread(){
        //создать новый, второй поток исполнения
        t = new Thread(this, "Демонстрационный поток");
        System.out.println(" Дочерний поток создан: " + t);
        t.start();// запустить поток исполнения
    }
    //Точка входа во второй поток исполнения
    public  void run(){

            try {
                for (int i = 3; i >0 ; i--) {
                    System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }

        } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван");
            }
        System.out.println("Дочерний поток завершен" );
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        new NewTread(); // создать новый поток
        try {
            for (int i = 4; i >0 ; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("гЛАВНЫЙ ПОТОК ПРЕРВАН");
        }
        System.out.println("Главный поток завершен");
    }
}