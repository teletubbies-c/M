//����Animal��
class Animal
{
	//��дObject���toString��������
	public String toString()
	{
		return "I am an Animal";
	}
}
//���������
public class rewritetoString
{
	public static  void main(String[] args)
	{
		Animal animal=new Animal();//����Animal����
		System.out.println(animal.toString());//��ӡanimal��toString���������ķ���ֵ
	}
}