package problem3Static;

public class Card {
	private static int cardNumber=10000;
	public Card(){
		
	}
	public static int getCardNumber(){
		cardNumber++;
		return cardNumber;
	}
}
