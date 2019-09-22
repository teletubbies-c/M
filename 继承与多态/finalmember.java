//定义Student类
class Student
{
	final String name;//使用final关键字修饰name属性
	//定义introduce（）方法，打印学生信息
	public void introduce()
	{
		System.out.println("我是一个学生，我叫"+name);
	}
}
//定义测试类
public class finalmember
{
	public static void main(String[] args)
	{
		Student stu=new Student();//创建Student类的实例
		stu.introduce();//调用Student的introduce（）方法
	}
}
//使用final关键字修饰成员变量时，虚拟机不会对其进行初始化。
//因此使用final修饰成员变量时，需要在定义变量的同时赋予一个初始值