
public class Inheritance {

	public static void main(String[] args) {
		CheckingAccount obj= new CheckingAccount();
		
		obj.accountNo= "111-22-33333";
		obj.ownerName="È«±æµ¿";
		obj.cardNo="555-666-777-888";
		obj.deposit(100000);
		try {
			int paidAmount = obj.pay("555-666-777-888", 47000);
			System.out.println("ÁöºÒ¾× : "+ paidAmount);
			System.out.println("ÀÜ¾× : "+ obj.balance);
		}catch(Exception e){
			String msg=e.getMessage();
			System.out.println(msg);
		}

	}

}
