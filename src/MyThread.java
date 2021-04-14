public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("run method");
        }
    }
}
class Demo{
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
        for (int i=0;i<5;i++)
        System.out.println("main method");
    }
}
