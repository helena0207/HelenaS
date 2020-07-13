package objArray;

interface PhoneInterface{
	int BUTTONS=20;
	void sendCall();
	void receiveCall();
}

interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{
	public void play();
	public void stop();
}

class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("��ȭ �ɱ�");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �ޱ�");
		
	}

	@Override
	public void play() {
		System.out.println("���� ���");
		
	}

	@Override
	public void stop() {
		System.out.println("��� ����");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("SMS ������");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("SMS �ޱ�");
		
	}
	
	public void schedule() {
		System.out.println("���� ����");
	}
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	
}
public class InterfaceEx {

	public static void main(String[] args) {
		SmartPhone p=new SmartPhone();
		p.sendCall();
		p.play();
		System.out.println(p.calculate(3, 5));
		p.schedule();
		System.out.println(p.toString());
	}

}
