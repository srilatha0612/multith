public class GetSet extends Thread{
    public static void main(String[] args) {
        GetSet g=new GetSet();
        System.out.println(g.getName());
        Thread.currentThread().setName("abc");
        System.out.println(Thread.currentThread().getName());
    }
}
