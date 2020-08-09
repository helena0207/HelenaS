package problem2take;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate mydate1=new MyDate(28,2,2012);
		MyDate mydate2=new MyDate(11,10,2008);
		
		System.out.println(mydate1.isValid());
		System.out.println(mydate2.isValid());

	}

}
