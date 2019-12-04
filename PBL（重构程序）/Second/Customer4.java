import java.util.Enumeration;
import java.util.Vector;

public class Customer4 {
	//�˿��� ���� �������������飨���ڴ�Ÿù˿����õĵ�Ӱ���ñ䳤������д�ţ�
	private String _name;
	private Vector _rentals =new Vector();
	
	public  Customer4(String name){
		
		_name=name;
	}
	
	public void addRental(Renta1 arg){
		
		_rentals.addElement(arg);
	}
	
	public String getName(){
		
		return _name;
	}
	
	public String statement(){
		
		double totalAmount=0;// �ܵ�����
		int frequentRenterPoints=0;//����
		Enumeration rentals =_rentals.elements();
		String result="Rental Record for "+getName()+"\n";//������
		
		while(rentals.hasMoreElements()){
			
			double thisAmount=0;
			Rental2 each=(Rental2)rentals.nextElement();
		
			thisAmount =each.getCharge();//�õ�ÿһ�ε����޼�¼
			
			frequentRenterPoints++;//����++
			
			if((each.getMovie().getPriceCode()==Movie1.NEW_RELEASE)&&
				each.getDaysRented()>1) frequentRenterPoints++;
			//��Ƭ������++
			result+="\t"+each.getMovie().getTitle()+"\t"+
			  String.valueOf(thisAmount)+"\n";
			totalAmount+=thisAmount;
		  }
			result+="Amount owed is "+String.valueOf(totalAmount)+"\n";
			result+="You earned "+String.valueOf(frequentRenterPoints)+
					" frequent renter points";
			
			return result;
		}
		
		 
		
}
	

