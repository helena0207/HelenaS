package hiding1104;

public class MyDateTest {

	public static void main(String[] args) {
		MyDatePractice date=new MyDatePractice();
		
		 // 접근이 가능하게 하니 엉뚱값을 할당하게됨.
		date.setMonth(2);
		date.setYear(2020);
		date.setDay(28);
	
		date.showIsValid();
		
		MyDate date2=new MyDate();
		date2.setDay(7);
		date2.setMonth(11);
		
		date2.showDate();
	}

}
