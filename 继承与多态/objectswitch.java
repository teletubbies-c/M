//定义Animal接口
interface Animal
{
	void shout();//定义抽象方法shout（）
}
//定义Cat类实现Animal类
class Cat implements Animal
{
	//实现抽象方法shout（）
	public void shout()
	{
		System.out.println("喵喵···");
	}
	//定义sleep（）方法
	void sleep()
	{
		System.out.println("猫睡觉····");
	}
}
//定义测试类
public class objectswitch
{
	public static void main(String[] args)
	{
		Cat cat=new Cat();//创建Cat类的实例
		animalShout(cat);//调用animalShout（）方法，将cat作为参数传入
	}
	//定义静态方法animalShout（），接受一个Animal类型的参数
	public static void  animalShout(Animal animal)
	{
		Cat cat=(Cat)animal;//将animal对象强制转换为Cat类型
		cat.shout();//调用cat的shout方法
		cat.sleep();//调用cat的sleep（）方法
		/*error:
		animal.shout();//调用传入参数animal的shout（）方法
		animal.sleep();//调用传入参数animal的sleep（0方法
		此种方法会报错。不能通过父类变量去调用子类中的某些方法，
		Aniaml类中没有定义sleep（）方法*/
	}
}