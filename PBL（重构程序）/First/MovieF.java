
public class MovieF {
	// ������һ����Ӱ�࣬������ ��Ӱ���ֺͼ۸��з������õ�ӰƱ�۸�͵õ���ӰƱ�۸�
	public static final int CHILDRENS=2;//childrens
	public static final int REGULAR=0;//regular
	public static final int NEW_RELEASE=1;//new__release
	
	private String _title;
	private int _priceCode;
	
	public MovieF(String title,int priceCode){
		
		_title=title;
		_priceCode=priceCode;
		
	}
	
	public int getPriceCode(){
		return _priceCode;
	}
	
	public void setPriceCode(int arg){
		_priceCode=arg;
	}
	
	public String getTitle(){
		return _title;
	}
}
