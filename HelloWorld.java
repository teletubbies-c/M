public class LazySingleton{
private static volatile LazySingleton instance=null;
//保证instance在所有线程中同步
private LazySingleton(){}
//private 避免类在外部被实例化
public static synchronized LazySingleton getInstance()
{
	//getinstance方法前同步
	if(instance==null)
	{
		instance=new LazySingleton();
	}
	return instance;
}
}
/*在并发编程中存在线程问题，主要原因为：1.存在共享数据2.
多线程共同操作共享数据。关键字synchronized可以保证在同一
时刻，只有一个线程可以执行某个方法或某个代码块，同时
synchronized可以保证一个线程的变化可见，即可以代替volatile
*/
public class HungrySingleton
{
	private static final HungrySingleton instance =new HungrySingleton();
	private HungrySingleton(){}
	public static HungrySingleton getInstance()
	{
		return instance;
	}
}