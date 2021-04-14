public class Yield extends Thread{
    public void run(){
        Thread.yield();
        System.out.println("child method");
    }
}
class ThreadDem{
    public static void main(String[] args) {
        Yield y=new Yield();
        y.start();
        System.out.println("main thread");
    }
}
