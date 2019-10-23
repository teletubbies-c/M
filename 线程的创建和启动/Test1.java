package xiancheng;

public class Test1 extends Thread
{ 
	public Test1(String name) 
	{
       super(name);
    }
	public void run() 
	{ 
	   System.out.println(this.getName());
    }
	public static void main(String[] args)
	{ 
		new Test1 ("Thread1").start();
		new Test1 ("Thread2").start();
	}

}


