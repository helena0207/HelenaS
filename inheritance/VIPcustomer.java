package inheritance;

public class VIPcustomer extends Customer{

	double salesRatio;
	private int agentID;
	
/*	public VIPcustomer(){
		//super();//상위 클래스의 default 생성자가 호출된다.
		super(0,null);
		customerGrade="VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
		System.out.println("VIPCustomer 생성자 호출");
	}*/
	public VIPcustomer(int customerID, String customerName) {
		super(customerID, customerName); //명시적으로 호출해야 한다.
		customerGrade="VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
		//System.out.println("VIPCustomer(int, string) 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {//상위 클래스와 같은 매개변수, 수
		bonusPoint+=price*bonusRatio;
		return price - (int)(price*salesRatio);
	}
}
//상위생성자 호출되고 하위생성자 호출된다.