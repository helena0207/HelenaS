class SMSSender extends MessageSender{
	String returnPhoneNo;
	String message;
	SMSSender(String title, String senderName, String returnphoneNo, String message){
		super(title, senderName);
		this.returnPhoneNo = returnphoneNo;
		this.message = message;
	}
	@Override
	void senderMessage(String recipient) {
		System.out.println("---------------------------");
		System.out.println("���� : " + title);
		System.out.println("������ ��� : " + senderName);
		System.out.println("��ȭ��ȣ : " + recipient);
		System.out.println("ȸ����ȭ��ȣ : " + returnPhoneNo);
		System.out.println("�޽��� ���� : " + message);
		
	}
	
}
