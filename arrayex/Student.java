package arrayex;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName){
		this.studentID=studentID;
		this.studentName=studentName;
		
		subjectList=new ArrayList<Subject>();
	}
	
	//������ �����ϴ�
	public void addSubject(String name, int score){
		
	}
}
