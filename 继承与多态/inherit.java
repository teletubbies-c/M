class Animal
{
	String name;//定义name属性
	void shout(){
		System.out.println("动物发出叫声");
	}//定义动物叫的方法
}
//定义Dog类继承Animal类
class Dog extends Animal
{
	//定义一个打印name的方法
	public void printname(){
		System.out.println("name="+name);
	}
}
//定义测试类
public class inherit
{
	public static void main(String[] args)
	{
		Dog dog =new Dog();//创建一个Dog类的实例对象
		dog.name="沙皮狗";//为Dog类的name属性进行赋值
		dog.printname();//调用Dog类的printname（）方法
		dog.shout();//调用Dog类继承来的shout的方法
	}	
}