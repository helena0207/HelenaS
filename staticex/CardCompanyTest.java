package staticex;

public class CardCompanyTest {
	public static void main(String[] args){
		CardCompany company=CardCompany.getInstance();// �̱��� ����

		
		Card myCard=company.createCard();//�޼��忡�� Card����
		Card yourCard=company.createCard();
		
		System.out.println(myCard.getCardNumber());
		System.out.println(yourCard.getCardNumber());
		//singTon pattern 100�� �ҷ��� ����.
		
		//Calendar calendar=new Calendar(); �̱��� ����
	}
}
