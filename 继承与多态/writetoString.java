//����Animal��
class Animal
{
	//���嶯��еķ���
	void shout()
	{
		System.out.println("����У�");
	}
}
//���������
public class writetoString
{
	public static void main(String[] args)
	{
		Animal animal=new Animal();//����Animal�����
		System.out.println(animal.toString());//����toString������������ӡ
	}
}
/*��JDK���ṩ��һ��Object�࣬����������ĸ��ࡣ��ÿ���඼ֱ�ӻ��Ӽ̳��Ը���
��ȻAnimal��û�ж������������������û�б���������ΪAnimalĬ�ϼ̳���Object�࣬
��Object���ж�����toString�����������ڸ÷���������˶���Ļ�����Ϣ*/