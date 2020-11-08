package staticex;

public class CardCompanyTest {
	public static void main(String[] args){
		CardCompany company=CardCompany.getInstance();// 싱글톤 패턴

		
		Card myCard=company.createCard();//메서드에서 Card생성
		Card yourCard=company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
		//singTon pattern 100번 불러도 같음.
		
		//Calendar calendar=new Calendar(); 싱글톤 패턴
	}
}
