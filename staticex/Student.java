package staticex;

public class Student {
	private static int serialNum=1000;
	private int studentID;
	public String studentName;
	public String address;
	
	public Student(String name){
		studentName=name;
		serialNum++;
		studentID=serialNum;
	}
	
	public Student(int id, String name){
		studentID=id;
		studentName=name;
		address="주소 없음";
		serialNum++;
		studentID=serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
		//인스턴스 변수는 static 메소드 안에서 사용할수 없다.
		//studentName="Lee";
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}

	public void showStudentInfo(){
		System.out.println(studentName+","+address);
	}
	public int getStudentID(){
		return studentID;
	}
	
}	
