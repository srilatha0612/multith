public class Pri extends Thread{
    public void run(){
        System.out.println("child thread");
    }
}
class ThredPri{
    public static void main(String[] args) {
        Pri p=new Pri();
        p.setPriority(10);
        p.start();
        System.out.println(p.getPriority());
    }
}
