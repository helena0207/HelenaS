package condingTest1103;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student(100,"Lee");
		studentLee.("����", 100);
		studentLee.setMathSubjsetKoreaSubjectect("����", 95);
		
		Student studentKim=new Student(101, "Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
