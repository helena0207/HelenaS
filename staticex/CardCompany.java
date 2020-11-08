package staticex;

public class CardCompany {
	private static CardCompany instance2=new CardCompany();
	
	private CardCompany(){}
	
	public static CardCompany getInstance(){
		if(instance2 == null){
			instance2=new CardCompany();
		}
		return instance2;
	}
	public Card createCard(){
		Card card=new Card();
		return card;
	}
	
}
