
public class CheckingTrafficCardAccount extends CheckingAccount {
	boolean hasTrafficCard;
	int payTrafficCard(String cardNo, int amount) throws Exception{
		if(!hasTrafficCard) {
			throw new Exception("����ī��� ��� �Ǿ� ���� �ʽ��ϴ�.");
		}
		return pay(cardNo, amount);
	}
}
