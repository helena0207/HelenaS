
public class InheritanceExample {

	public static void main(String[] args) {
		EmailSender obj1= new EmailSender("���������մϴ�.", "������","admin@dklsd.com","10%���������� ���� �Ǿ����ϴ�.");
		SMSSender obj2 = new SMSSender("���������մϴ�.", "������","010-000-0000","10%���������� ���� �Ǿ����ϴ�.");
		
		obj1.senderMessage("hti@dkfhd.com");
		obj1.senderMessage("oeuto@dklsfl.com");
		obj2.senderMessage("010-3253-3250");

	}

}
