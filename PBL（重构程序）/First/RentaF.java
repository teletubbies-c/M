
public class Renta1F {
	//租赁类 有属性 电影类 和租用 方法 租用天数和租用的电影
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
