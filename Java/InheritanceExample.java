
public class InheritanceExample {

	public static void main(String[] args) {
		EmailSender obj1= new EmailSender("생일축하합니다.", "고객센터","admin@dklsd.com","10%할인쿠폰이 발행 되었습니다.");
		SMSSender obj2 = new SMSSender("생일축하합니다.", "고객센터","010-000-0000","10%할인쿠폰이 발행 되었습니다.");
		
		obj1.senderMessage("hti@dkfhd.com");
		obj1.senderMessage("oeuto@dklsfl.com");
		obj2.senderMessage("010-3253-3250");

	}

}
