//定义Animal类
class Animal
{
	//定义动物叫的方法
	void shout()
	{
		System.out.println("动物叫！");
	}
}
//定义测试类
public class writetoString
{
	public static void main(String[] args)
	{
		Animal animal=new Animal();//创建Animal类对象
		System.out.println(animal.toString());//调用toString（）方法并打印
	}
}
/*在JDK中提供了一个Object类，它是所有类的父类。即每个类都直接或间接继承自该类
虽然Animal类没有定义这个方法，但程序并没有报错，这是因为Animal默认继承自Object类，
在Object类中定义了toString（）方法，在该方法中输出了对象的基本信息*/