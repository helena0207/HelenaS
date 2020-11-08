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
	
	//과목을 수강하다
	public void addSubject(String name, int score){
		
	}
}
