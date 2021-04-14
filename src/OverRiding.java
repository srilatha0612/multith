public class OverRiding extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("first method");
        }
    }

    public void start() {
        for (int i = 0; i < 5; i++) {
            System.out.println("second method");
        }
    }
}
class Dem{
    public static void main(String[] args) {
        OverRiding oo=new OverRiding();
        oo.start();
        System.out.println("method method");
    }
}
