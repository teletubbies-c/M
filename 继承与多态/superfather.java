//定义Animal类
class Animal
{
	String name="动物";
	//定义动物叫的方法
	void shout() 
	{
		System.out.println("动物发出叫声");
	}
}
//定义Dog类继承动物类
class Dog extends Animal
{
	String name="犬类";
	//重写父类的shout（）方法
	void shout()
	{
		super.shout();//访问父类的成员方法
	}
	void printName()
	{
		System.out.println("name="+super.name);//访问父类的成员变量
	}
}
//定义测试类
public class superfather
{
	public static void main(String[] args)
	{
		Dog dog=new Dog();//创建一个Dog对象
		dog.shout();//调用dog对象重写的shout方法
		dog.printName();//调用dog对象的printName（）方法
	}
}