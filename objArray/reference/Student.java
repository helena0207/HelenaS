package reference;
	public class Student{
		private static int serialNum=1000;
	    private int studentId;
	    String studentName;

	    Subject korea;
	    Subject math;

	    public Student(int id, String name){
	        studentId=id;
	        studentName=name;
	        serialNum++;
	        studentId=serialNum;

	        korea=new Subject();
	        math=new Subject();
	    }
	    public void setKoreaSubject(String name, int score){
	        korea.subjectName=name;
	        korea.score=score;
	    }
	    public void setMathSubject(String name, int score){
	        math.subjectName=name;
	        math.score=score;
	    }
	    public void showStudentTotal(){
	        int total=korea.score + math.score;
	        System.out.println(studentName +"�л��� ������ "+total+"�Դϴ�.");
	    }
	    public int getStudentId(){
	    	return studentId;
	    }
		public static int getSerialNum() {
			return serialNum;
		}
		public static void setSerialNum(int serialNum) {
			Student.serialNum = serialNum;
		}
	    
	}
