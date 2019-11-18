import java.util.*;
public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	//假定是被叫号码
	private StringBuffer communicationRedcords;
	//假定是主叫号码
	public TelcomUser(String phoneNumber)
	{
		this.phoneNumber  = phoneNumber;
		this.communicationRedcords = new StringBuffer();
		//假定通话记录存在这里，以分号分割；每条记录内部有主叫号码、被叫号码、开始时间、结束时间
	}
	//模拟通话记录的生成
	void generateCommunicateRecord() 
	{
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		for(int i = 0;i<=recordNum;i++)
		{
			//随机生成第i条通话记录
			//开始时间，当前时间之前的某个随机时间
			//结束时间开始后的十分钟内随机的一个时间，至少一分钟
			//被叫号码
			//插入通话记录
		}
	}
	//随机生成被叫号码（后四位随机）并返回
	private String getCallToPhoneNumber()
	{
		return "1380372" + String.valueOf()+String.valueOf()+String.valueOf());
	}
	//模拟计费方法，以字符串的形式返回保留4位小数的计费结果
	private String accountFee(long timeStart,long timeEnd)
	{
		//开始时间，当前时间之前的某个随机时间
		//long timeStart = System.currentTimeMillis()- new Rondom().nextInt(36000000);
		//结束时间开始后的十分钟内随机的一个时间，至少一分钟
		//long timeEnd = timeStart + 60000 +new Rondom().nextInt(600000);
		//每分钟收费*元
		double feePerMinute = 0.2;
		//通话分钟数按四舍五入计算
		int minutes = Math.abs((timeEnd-timeStat)/60000);
		double feeTotal = feePerMinute*minutes;
		return String.format("%.4f",feeTotal);
	}
	//打印通话记录
	void printDetails()
	{
		//获取全部通话记录
		String allRecords = this.communicationRedcords.toString();
		//分隔通话记录
		String [] recordArray = allRecords.splits(":");
		//循环分割记录内的每一项并输出
		for(int i = 0;i<recordArray.length;i++)
		{
			
		}
	}
	

}
