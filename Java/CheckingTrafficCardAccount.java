
public class CheckingTrafficCardAccount extends CheckingAccount {
	boolean hasTrafficCard;
	int payTrafficCard(String cardNo, int amount) throws Exception{
		if(!hasTrafficCard) {
			throw new Exception("교통카드로 등록 되어 있지 않습니다.");
		}
		return pay(cardNo, amount);
	}
}
