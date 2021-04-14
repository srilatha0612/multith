public class OverLoading extends Thread{
    public void run(){
        System.out.println("firstmethod");
    }
    void run(int i){
        System.out.println("second method");
    }
}
class De{
    public static void main(String[] args) {
        OverLoading o=new OverLoading();
        o.start();
        System.out.println("main method");
    }
}
