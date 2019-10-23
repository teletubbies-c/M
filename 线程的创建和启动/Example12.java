package xiancheng;

//����Ticket1��̳�Runnable�ӿ�
class Changke implements Runnable {
	private int chengke = 100; // �������tickets������ֵ10
	Object lock = new Object(); // ��������һ����������ͬ����������
	public void run() {
		while (true) {
			synchronized (lock) { // ����ͬ�������
				try {
					Thread.sleep(200); // �������߳�����10����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (chengke> 0) {
					System.out.println(Thread.currentThread().getName()
							+ "---�����ĳ˿�" + chengke--);
				} else { // ��� ticketsС��0������ѭ��
					break;
				}
			}
		}
	}
}
public class Example12 {
	public static void main(String[] args) {
		Changke chengke = new Changke(); // ����Ticket1����
		// �����������ĸ��߳�
		new Thread(chengke, "˾��1").start();
		new Thread(chengke, "˾��2").start();
		new Thread(chengke, "˾��3").start();
		new Thread(chengke, "˾��4").start();
		new Thread(chengke, "˾��5").start();
	}
}