class Animal
{
	public Animal(String name)
	{
		System.out.println("����һֻ"+name);
	}
}
class Dog extends Animal
{
	public Dog()
	{
		super("ɳƤ��"); 
	}
}
public class supconmean
{
	public static void main(String[] args)
	{
		Dog dog=new Dog();
	}
}