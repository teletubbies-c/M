
public class Renta1F {
	//������ ������ ��Ӱ�� ������ ���� �������������õĵ�Ӱ
	private MovieF _movie;
	private int _daysRented;
	
	public Renta1F(MovieF movie,int daysRented){
		
		_movie=movie;
		_daysRented=daysRented;
		
		
	}
	public int getDaysRented(){
		
		return _daysRented;
	}
	public MovieF getMovie(){
		
		return _movie;
	}
}
