package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	
	public Customer(){
		customerGrade="SILVER";
		bonusRatio=0.01;
		
	}
}
