package xiancheng;

public class Test2 implements Runnable{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("new");
		}
	}
	public static void main(String[] args) {
		new Thread (new Test2()).start();
		for(int i=0;i<100;i++) {
			System.out.println("main");
		}
	}
}
