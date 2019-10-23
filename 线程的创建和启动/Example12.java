package xiancheng;

//定义Ticket1类继承Runnable接口
class Changke implements Runnable {
	private int chengke = 100; // 定义变量tickets，并赋值10
	Object lock = new Object(); // 定义任意一个对象，用作同步代码块的锁
	public void run() {
		while (true) {
			synchronized (lock) { // 定义同步代码块
				try {
					Thread.sleep(200); // 经过的线程休眠10毫秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (chengke> 0) {
					System.out.println(Thread.currentThread().getName()
							+ "---拉过的乘客" + chengke--);
				} else { // 如果 tickets小于0，跳出循环
					break;
				}
			}
		}
	}
}
public class Example12 {
	public static void main(String[] args) {
		Changke chengke = new Changke(); // 创建Ticket1对象
		// 创建并开启四个线程
		new Thread(chengke, "司机1").start();
		new Thread(chengke, "司机2").start();
		new Thread(chengke, "司机3").start();
		new Thread(chengke, "司机4").start();
		new Thread(chengke, "司机5").start();
	}
}