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
//���������
public class objectswitch
{
	public static void main(String[] args)
	{
		Cat cat=new Cat();//����Cat���ʵ��
		animalShout(cat);//����animalShout������������cat��Ϊ��������
	}
	//���徲̬����animalShout����������һ��Animal���͵Ĳ���
	public static void  animalShout(Animal animal)
	{
		Cat cat=(Cat)animal;//��animal����ǿ��ת��ΪCat����
		cat.shout();//����cat��shout����
		cat.sleep();//����cat��sleep��������
		/*error:
		animal.shout();//���ô������animal��shout��������
		animal.sleep();//���ô������animal��sleep��0����
		���ַ����ᱨ������ͨ���������ȥ���������е�ĳЩ������
		Aniaml����û�ж���sleep��������*/
	}
}