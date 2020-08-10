package problem3Static;

public class CardCompany {

	private static CardCompany cardcampany=new CardCompany();
	
	private CardCompany(){
	}
	
	public static CardCompany getInstance(){
		return cardcampany;
	}
	public Card createCard() {
		Card card=new Card();
		return card;
	}
	
}
