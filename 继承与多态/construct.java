//����Animal��
class Animal
{
	//����Animal�޲εĹ��췽��
	public Animal()
	{
		System.out.println("����һֻ����");
	}
	//����Animal�вεĹ��췽��
	public Animal(String name)
	{
		System.out.println("����һֻ"+name);
	}
}
//����Dog�࣬�̳���Animal��
class Dog extends Animal
{
	//����Dog���޲εĹ��췽��
	public Dog()
	{
		//���������޴���
	}
}
//���������
public class construct
{
	public static void main(String[] args)
	{
		Dog dog=new Dog();//����Dog���ʵ��
	}
}