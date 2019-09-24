class Animal
{
	int age;
	String name;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void cry()
	{
		System.out.println("�Ҳ�֪����ʲô");
	}
	public void eat()
	{
		System.out.println("�Ҳ�֪����ʲô");
	}
}
class Dog extends Animal
{
	public void cry()
	{
		System.out.println("����`````");
	}
	public void eat()
	{
		System.out.println("���ǹ����ӣ��Թ�ͷ");
	}
}
class Cat extends Animal
{
	public void cry()
	{
		System.out.println("����~~~");
	}
	public void eat()
	{
		System.out.println("�������䡣������");
	}
}
class Food
{
	String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void showName()
	{
		
	}
}
class Fish extends Food
{
	public void showName()
	{
		System.out.println("ʳ���");
	}
}
class Bone extends Food
{
	public void showName()
	{
		System.out.println("ʳ���ͷ");
	}
}
class Master
{
	public void feed(Animal an,Food f)
	{
		an.eat();
		f.showName();
	}
}	
public class myexample
{
	public static void main(String[] args)
	{
		Master master=new Master();
		master.feed(new Dog(),new Bone());
		master.feed(new Cat(),new Fish());
	}
}
//��ν��̬������ָһ�����ã����ͣ��ڲ�ͬ������µĶ���״̬��Ҳ�������Ϊ��
//��̬��ָͨ��ָ�����ָ�룬�������ڲ�ͬ������ʵ�ֵķ���