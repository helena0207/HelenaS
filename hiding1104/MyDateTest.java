package hiding1104;

public class MyDateTest {

	public static void main(String[] args) {
		MyDatePractice date=new MyDatePractice();
		
		 // ������ �����ϰ� �ϴ� ���װ��� �Ҵ��ϰԵ�.
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
