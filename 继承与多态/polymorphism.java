//����Animal�ӿ�
interface Animal
{
	void shout();//�������shout����
}
//����Cat��ʵ��Animal�ӿ�
class Cat implements Animal
{
	//ʵ��shout��������
	public void shout()
	{
		System.out.println("������������");
	}
}
//����Dog��ʵ��Animal�ӿ�
class Dog implements Animal
{
	//ʵ��shout��������
	public void shout()
	{
		System.out.println("������������");
	}
}
//���������
public class polymorphism
{
	public static void main(String[] args)
	{
		Animal an1=new Cat();//����Cat����ʹ��Animal���͵ı���
		Animal an2=new Dog();//����Dog����ʹ��Animal���͵ı���
		animalshout(an1);//����animalshout������������an1��Ϊ��������
		animalshout(an2);//����animalshout������������an2��Ϊ��������
	}	
	//���徲̬��animalshout��������������һ��Animal���͵Ĳ���
	public static void animalshout(Animal an)
	{
		an.shout();//����ʵ�ʲ�����shout��������
	}
}