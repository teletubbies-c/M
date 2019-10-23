package xiancheng;

public class Test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Teacher t=new Teacher();
		new Thread(t,"张老师").start();
		new Thread(t,"王老师").start();
		new Thread(t,"贾老师").start();
	}

}
class Teacher implements Runnable{
	private int notes=80;
	public void run() {
		while(true) {
			dispatchNotes();
			if(notes<=0) {
				break;
			}
		}
	}
private synchronized void dispatchNotes() {
	if(notes>0) {
		try {
			Thread.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"---发出的笔记"+notes--);
	}
} 
}