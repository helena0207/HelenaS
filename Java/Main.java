

public class Main {

	public static void main(String[] args) {
	
		SubscribeInfo obj1, obj2;
			
			obj1 = new SubscribeInfo("ȫ����", "dineout","*****");
			obj2 = new SubscribeInfo("�̵���", "youakim","253212", "010-000-0000", " �ް�������Ÿ��");
			
			printSubscribeInfo(obj1);
			printSubscribeInfo(obj2);
				
	}

	static void printSubscribeInfo(SubscribeInfo obj)
	{
		System.out.println("�̸� : " + obj.name);
		System.out.println("���̵� : " + obj.id);
		System.out.println("�н����� : " + obj.password);
		System.out.println("��ȭ��ȣ : " + obj.phoneNo);
		System.out.println("�ּ� : " + obj.address);
		
	}
}
