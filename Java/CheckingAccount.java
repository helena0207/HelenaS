
public class CheckingAccount extends Account{
	String cardNo;//����ī�� ��ȣ
	int pay(String cardNo, int amount) throws Exception{// ����ī�� ������ �����Ѵ�.
		if(!cardNo.contentEquals(this.cardNo) || (balance < amount)) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		return withdraw(amount);
	}
}
