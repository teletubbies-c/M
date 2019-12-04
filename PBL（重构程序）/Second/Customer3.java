import java.util.Enumeration;
import java.util.Vector;

public class Customer3 {
	//�˿��� ���� �������������飨���ڴ�Ÿù˿����õĵ�Ӱ���ñ䳤������д�ţ�
	private String _name;
	private Vector _rentals =new Vector();
	
	public  Customer3(String name){
		
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
			Renta1 each=(Renta1)rentals.nextElement();
			
			thisAmount =amountFor(each);//�õ�ÿһ�ε����޼�¼
			
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
		
		private double amountFor(Renta1 aRental){
			
			double thisAmount=0;
			
			switch(aRental.getMovie().getPriceCode()){
			case Movie1.REGULAR:
			 thisAmount+=2;
			 if(aRental.getDaysRented()>2)
				thisAmount+=(aRental.getDaysRented()-2)*1.5;
			  break;
			case Movie1.NEW_RELEASE:
				thisAmount+=aRental.getDaysRented()*3;
				break;
			case Movie1.CHILDRENS:
				thisAmount+=1.5;
				if(aRental.getDaysRented()>3)
					thisAmount+=(aRental.getDaysRented()-3)*1.5;
				break;
			
		}
			
			return thisAmount;
		}
		
}
	

