package staticex;

public class StudentIDTest {

	public static void main(String[] args) {
		Student studentLee=new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		Student studentkim=new Student("kim");
		System.out.println(Student.serialNum);
		System.out.println(Student.serialNum);
		
		System.out.println(studentLee.getStudentID());
		System.out.println(studentkim.getStudentID());
		
	}

}
