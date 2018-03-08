package Test;

/**
 * Created by NY on 2018/3/8.
 */
public class PrintWithThreeThread implements Runnable{
    String name;
    Object prev,self;

    public PrintWithThreeThread(String name,Object prev,Object self){
        this.name = name;
        this.prev = prev;
        this.self = self;
    }
    public void run(){
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.println(this.name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        PrintWithThreeThread pt1 = new PrintWithThreeThread("A",c,a);
        PrintWithThreeThread pt2 = new PrintWithThreeThread("B",a,b);
        PrintWithThreeThread pt3 = new PrintWithThreeThread("C",b,c);
        Thread ta = new Thread(pt1);
        Thread tb = new Thread(pt2);
        Thread tc = new Thread(pt3);
        ta.start();
        Thread.sleep(1000);
        tb.start();
        Thread.sleep(1000);
        tc.start();
    }
}
