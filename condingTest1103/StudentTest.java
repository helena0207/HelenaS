package condingTest1103;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student(100,"Lee");
		studentLee.("국어", 100);
		studentLee.setMathSubjsetKoreaSubjectect("수학", 95);
		
		Student studentKim=new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
