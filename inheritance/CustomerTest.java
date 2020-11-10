package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
/*		Customer customerLee=new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint=1000;
		System.out.println(customerLee.showCustomerInfo());
*/		
		//VIPcustomer customerKim=new VIPcustomer(10020,"김유신"); 
		
		Customer customerKim=new VIPcustomer(10020,"김유신"); 
		//상위 클래스로는 묵시적으로 형변환이 된다.(업캐스팅)
		//부모의 변수를 다 사용할수 있다
		//멤버변수가 힙 영역에 잡혀 있음을 알수 있다.
		//customerKim.setCustomerName("김유신");
		//customerKim.setCustomerID(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
		

	}

}
