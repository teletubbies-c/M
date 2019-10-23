package xiancheng;

public class Test4  extends Thread{
	private int stratNum;
	public static int sum;
	public Test4(int startNum) {
		this.stratNum=startNum;
	}
	public static synchronized void add(int num) {
		sum+=num;
	}
	public void run() {
		int sum=0;
		for(int i=0;i<10;i++) {
			sum+=stratNum+i;
		}
		add(sum);
     }
	public static void main(String[] args) throws Exception {
		Thread[] threadList=new Thread[10];
		for(int i=0;i<10;i++) {
			threadList[i]=new Test4(10*i+1);
			threadList[i].start();
		}
		for(int i=0;i<10;i++) {
			threadList[i].join();
		}
		System.out.print("Sum is :"+sum);
		
	}
}