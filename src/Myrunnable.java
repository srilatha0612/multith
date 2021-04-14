public class Myrunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("my method");
        }
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        Myrunnable m=new Myrunnable();
        Thread t=new Thread(m);
        t.start();
        System.out.println("main method");
    }
}
