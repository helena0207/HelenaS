package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		Customer customerLee=new Customer(10010,"이순신");
		customerLee.bonusPoint=1000;
		//System.out.println(customerLee.showCustomerInfo());
		
		VIPcustomer customerKim=new VIPcustomer(10020,"김유신");
		customerKim.bonusPoint=10000;
		//System.out.println(customerKim.showCustomerInfo());
		
		int priceLee=customerLee.calcPrice(10000);
		int priceKime=customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo()+"지불금액은 "+priceLee);
		System.out.println(customerKim.showCustomerInfo()+"지불금액은 "+priceKime);
		
		Customer customerNo=new VIPcustomer(10030,"나몰라");
		customerNo.bonusPoint=10000;
		System.out.println(customerNo.showCustomerInfo()+"지불금액은 "+customerNo.calcPrice(10000));
	}

}
