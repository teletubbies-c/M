public class HungrySingleton
{
	private static  HungrySingleton Instance=new HungrySingleton();
	private HungrySingleton(){};
	public static HungrySingleton getInstance()
	{
		return Instance;
	}
}