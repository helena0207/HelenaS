package reference;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee=new Student(100,"Lee");
		studentLee.setKoreaSubject("����",50);
		studentLee.setMathSubject("����", 90);
		studentLee.showStudentTotal();
		
		Student studentKim=new Student(200,"kim");
		studentKim.setKoreaSubject("����", 75);
		studentKim.setMathSubject("����", 90);
		studentKim.showStudentTotal();

		
	}

}
