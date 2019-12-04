
public class Rental4 {
	//������ ������ ��Ӱ�� ������ ���� �������������õĵ�Ӱ
	private Movie2 _movie;
	private int _daysRented;
	
	public Rental4(Movie2 movie,int daysRented){
		
		_movie=movie;
		_daysRented=daysRented;
		
		
	}
	public int getDaysRented(){
		
		return _daysRented;
	}
	public Movie2 getMovie(){
		
		return _movie;
	}
	
	double getCharge(){
		return _movie.getCharge(_daysRented);
	}
	 
	int getFrequentRenterPoints(){
		
		if((getMovie().getPriceCode()==Movie1.NEW_RELEASE)&&
				getDaysRented()>1) return 2;
		else
			 return 1;
						
		
	}
}
