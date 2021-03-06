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
//定义Dog类实现Animal接口
class Dog implements Animal
{
	//实现shout（）方法
	public void shout()
	{
		System.out.println("汪汪···");
	}
}
//创建测试类
public class instanceofswitch
{
	public static void main(String[] args)
	{
		Dog dog=new Dog();//创建Dog类型的实例对象
		animalShout(dog);//调用animalShout（）方法，将dog作为参数传入
	}
	//定义静态方法animalShout（），接收一个Animal类型的参数
	public static void animalShout(Animal animal)
	{
		if(animal instanceof Cat)//判断animal是否是cat类的实例
		{
			Cat cat=(Cat)animal;//将animal强制转换成Cat类型
			cat.shout();//调用cat的shout（）方法
			cat.sleep();//调用cat的sleep（）方法
		}
		else{
			System.out.println("This animal is not a cat!");
		}
		/*Cat cat=(Cat)animal;//将Animal对象强制转换成Cat类型
		cat.shout();//调用cat的shout（）方法
		cat.sleep();//调用cat的sleep（）方法*/
	}
}