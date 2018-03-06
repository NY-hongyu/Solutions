package Test;

/**
 * Created by NY on 2018/3/6.
 */
public class TestSynMethod implements Runnable {
	int b = 100;
	public synchronized void m1(){
		b = 1000;
		try{
			Thread.sleep(5000);
		}catch (Exception e){
			e.printStackTrace();	
		}
		System.out.println("b = " + b);
	}
	
	public void m2(){
		
	
		try{
			Thread.sleep(2000);
		}catch (Exception e){
			e.printStackTrace();	
		}
		b = 2000;
	}
	
	public void run(){
		m1();
	}
	
	public static void main(String[] args){
		TestSynMethod stm1 = new TestSynMethod();
		Thread t1 = new Thread(stm1);
		t1.start();
		stm1.m2();
		System.out.println(stm1.b);
	}
}
