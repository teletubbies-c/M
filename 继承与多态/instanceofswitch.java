//����Animal�ӿ�
interface Animal
{
	void shout();//������󷽷�shout����
}
//����Cat��ʵ��Animal��
class Cat implements Animal
{
	//ʵ�ֳ��󷽷�shout����
	public void shout()
	{
		System.out.println("����������");
	}
	//����sleep��������
	void sleep()
	{
		System.out.println("è˯����������");
	}
}
//����Dog��ʵ��Animal�ӿ�
class Dog implements Animal
{
	//ʵ��shout��������
	public void shout()
	{
		System.out.println("����������");
	}
}
//����������
public class instanceofswitch
{
	public static void main(String[] args)
	{
		Dog dog=new Dog();//����Dog���͵�ʵ������
		animalShout(dog);//����animalShout������������dog��Ϊ��������
	}
	//���徲̬����animalShout����������һ��Animal���͵Ĳ���
	public static void animalShout(Animal animal)
	{
		if(animal instanceof Cat)//�ж�animal�Ƿ���cat���ʵ��
		{
			Cat cat=(Cat)animal;//��animalǿ��ת����Cat����
			cat.shout();//����cat��shout��������
			cat.sleep();//����cat��sleep��������
		}
		else{
			System.out.println("This animal is not a cat!");
		}
		/*Cat cat=(Cat)animal;//��Animal����ǿ��ת����Cat����
		cat.shout();//����cat��shout��������
		cat.sleep();//����cat��sleep��������*/
	}
}