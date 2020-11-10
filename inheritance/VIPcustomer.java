package inheritance;

public class VIPcustomer extends Customer{

	double salesRatio;
	private int agentID;
	
/*	public VIPcustomer(){
		//super();//���� Ŭ������ default �����ڰ� ȣ��ȴ�.
		super(0,null);
		customerGrade="VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
		System.out.println("VIPCustomer ������ ȣ��");
	}*/
	public VIPcustomer(int customerID, String customerName) {
		super(customerID, customerName); //��������� ȣ���ؾ� �Ѵ�.
		customerGrade="VIP";
		bonusRatio=0.05;
		salesRatio=0.1;
		//System.out.println("VIPCustomer(int, string) ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {//���� Ŭ������ ���� �Ű�����, ��
		bonusPoint+=price*bonusRatio;
		return price - (int)(price*salesRatio);
	}
}
//���������� ȣ��ǰ� ���������� ȣ��ȴ�.