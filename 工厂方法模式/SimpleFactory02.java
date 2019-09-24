public class SimpleFactory02
{
	public static void main(String[] args)
	{
		ZhongXi02 yyqx02=new YYQX02();
		yyqx02.getActor().yingshiju();
		
		ZhongXi02 wk02=new WK02();
		wk02.getActor().yingshiju();
		
		ZhongXi02 lhr02=new LHR02();
		lhr02.getActor().yingshiju();
		
	}
}