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
		address="�ּ� ����";
		serialNum++;
		studentID=serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
		//�ν��Ͻ� ������ static �޼ҵ� �ȿ��� ����Ҽ� ����.
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
