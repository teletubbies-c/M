import java.util.*;
public class TelcomUser {
	private String phoneNumber;
	private String callTo;
	//�ٶ��Ǳ��к���
	private StringBuffer communicationRedcords;
	//�ٶ������к���
	public TelcomUser(String phoneNumber)
	{
		this.phoneNumber  = phoneNumber;
		this.communicationRedcords = new StringBuffer();
		//�ٶ�ͨ����¼��������Էֺŷָÿ����¼�ڲ������к��롢���к��롢��ʼʱ�䡢����ʱ��
	}
	//ģ��ͨ����¼������
	void generateCommunicateRecord() 
	{
		//�������ͨ����¼��Ŀ
		int recordNum = new Random().nextInt(10);
		for(int i = 0;i<=recordNum;i++)
		{
			//������ɵ�i��ͨ����¼
			//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
			//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
			//���к���
			//����ͨ����¼
		}
	}
	//������ɱ��к��루����λ�����������
	private String getCallToPhoneNumber()
	{
		return "1380372" + String.valueOf()+String.valueOf()+String.valueOf());
	}
	//ģ��Ʒѷ��������ַ�������ʽ���ر���4λС���ļƷѽ��
	private String accountFee(long timeStart,long timeEnd)
	{
		//��ʼʱ�䣬��ǰʱ��֮ǰ��ĳ�����ʱ��
		//long timeStart = System.currentTimeMillis()- new Rondom().nextInt(36000000);
		//����ʱ�俪ʼ���ʮ�����������һ��ʱ�䣬����һ����
		//long timeEnd = timeStart + 60000 +new Rondom().nextInt(600000);
		//ÿ�����շ�*Ԫ
		double feePerMinute = 0.2;
		//ͨ���������������������
		int minutes = Math.abs((timeEnd-timeStat)/60000);
		double feeTotal = feePerMinute*minutes;
		return String.format("%.4f",feeTotal);
	}
	//��ӡͨ����¼
	void printDetails()
	{
		//��ȡȫ��ͨ����¼
		String allRecords = this.communicationRedcords.toString();
		//�ָ�ͨ����¼
		String [] recordArray = allRecords.splits(":");
		//ѭ���ָ��¼�ڵ�ÿһ����
		for(int i = 0;i<recordArray.length;i++)
		{
			
		}
	}
	

}
