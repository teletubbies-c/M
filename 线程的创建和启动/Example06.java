package xiancheng;
class DamonThread implements Runnable{//����DemonThread�࣬ʵ��Runnable�ӿ�
	public void run() {//ʵ�ֽӿ��е�run��������
		while(true) {
			System.out.println(Thread.currentThread().getName()+"---is running.");
		}
	}
}

public class Example06 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("main�߳��Ǻ�̨�߳�ô��"+Thread.currentThread().isDaemon());
		DamonThread dt=new DamonThread();//����һ��DamonThread����dt
		Thread t=new Thread(dt,"��̨�߳�");//�����߳�t����dt��Դ
		System.out.println("t�߳�Ĭ���Ǻ�̨�߳�ô��"+t.isDaemon());//�ж��Ƿ�Ϊ��̨�߳�
		t.setDaemon(true);//���߳�t����Ϊ��̨�߳�
		t.start();//����start�������������߳�
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}

	}

}
