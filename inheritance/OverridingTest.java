package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010,"�̼���");
		customerLee.bonusPoint=1000;
		//System.out.println(customerLee.showCustomerInfo());
		
		VIPcustomer customerKim=new VIPcustomer(10020,"������");
		customerKim.bonusPoint=10000;
		//System.out.println(customerKim.showCustomerInfo());
		
		int priceLee=customerLee.calcPrice(10000);
		int priceKime=customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo()+"���ұݾ��� "+priceLee);
		System.out.println(customerKim.showCustomerInfo()+"���ұݾ��� "+priceKime);
		
		Customer customerNo=new VIPcustomer(10030,"������");
		customerNo.bonusPoint=10000;
		System.out.println(customerNo.showCustomerInfo()+"���ұݾ��� "+customerNo.calcPrice(10000));
	}

}
