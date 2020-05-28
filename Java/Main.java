

public class Main {

	public static void main(String[] args) {
	
		SubscribeInfo obj1, obj2;
			
			obj1 = new SubscribeInfo("홍윤희", "dineout","*****");
			obj2 = new SubscribeInfo("이동규", "youakim","253212", "010-000-0000", " 메가폴리스타워");
			
			printSubscribeInfo(obj1);
			printSubscribeInfo(obj2);
				
	}

	static void printSubscribeInfo(SubscribeInfo obj)
	{
		System.out.println("이름 : " + obj.name);
		System.out.println("아이디 : " + obj.id);
		System.out.println("패스워드 : " + obj.password);
		System.out.println("전화번호 : " + obj.phoneNo);
		System.out.println("주소 : " + obj.address);
		
	}
}
