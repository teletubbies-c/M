package xiancheng;

public class Test3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Teacher t=new Teacher();
		new Thread(t,"����ʦ").start();
		new Thread(t,"����ʦ").start();
		new Thread(t,"����ʦ").start();
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
		System.out.println(Thread.currentThread().getName()+"---�����ıʼ�"+notes--);
	}
} 
}