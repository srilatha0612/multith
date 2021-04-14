public class Join extends Thread{
    public void run(){
        System.out.println("first");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){

        }

        }
    }
class MyDe{
    public static void main(String[] args) {
        Join j=new Join();
        j.start();
       // j.join(1);
        System.out.println("second");
    }
}
