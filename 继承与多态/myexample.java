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
		System.out.println("我不知道叫什么");
	}
	public void eat()
	{
		System.out.println("我不知道吃什么");
	}
}
class Dog extends Animal
{
	public void cry()
	{
		System.out.println("汪汪`````");
	}
	public void eat()
	{
		System.out.println("咱是狗娃子，吃骨头");
	}
}
class Cat extends Animal
{
	public void cry()
	{
		System.out.println("喵喵~~~");
	}
	public void eat()
	{
		System.out.println("咱是喵咪。爱吃鱼");
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
		System.out.println("食物：鱼");
	}
}
class Bone extends Food
{
	public void showName()
	{
		System.out.println("食物：骨头");
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
//所谓多态，就是指一个引用（类型）在不同的情况下的多种状态，也可以理解为：
//多态是指通过指向父类的指针，来调用在不同子类中实现的方法