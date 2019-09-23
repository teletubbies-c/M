//定义Animal接口
interface Animal
{
	void shout();//定义抽象shout方法
}
//定义Cat类实现Animal接口
class Cat implements Animal
{
	//实现shout（）方法
	public void shout()
	{
		System.out.println("喵喵····");
	}
}
//定义Dog类实现Animal接口
class Dog implements Animal
{
	//实现shout（）方法
	public void shout()
	{
		System.out.println("汪汪····");
	}
}
//定义测试类
public class polymorphism
{
	public static void main(String[] args)
	{
		Animal an1=new Cat();//创建Cat对象，使用Animal类型的变量
		Animal an2=new Dog();//创建Dog对象，使用Animal类型的变量
		animalshout(an1);//调用animalshout（）方法，将an1作为参数传入
		animalshout(an2);//调用animalshout（）方法，将an2作为参数传入
	}	
	//定义静态的animalshout（）方法，接受一个Animal类型的参数
	public static void animalshout(Animal an)
	{
		an.shout();//调用实际参数的shout（）方法
	}
}