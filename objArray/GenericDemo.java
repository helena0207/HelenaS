package objArray;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade=grade;
	}
}
/*
class StudentPerson{  //��ī������ ����. Ÿ���� �����ϴ�.
	public StudentInfo info;
	StudentPerson(StudentInfo info){
		this.info=info;
	}
}
// step 2.
class Person{
	public Object info;
	Person(Object info){
		this.info=info;
	}
}
*/
class Person<T,S>{ //int, char ���� ������ Ÿ������ �����ϸ� �ȵȴ�. ��ü ������ ����ؾ���.
	public T info;
	public S id;
	Person(T info, S id){
		this.info=info;
		this.id=id;
	}
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank=rank;
	}
}
/*
class EmployeePerson{  //��ī������ ����. Ÿ���� �����ϴ�.
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){
		this.info=info;
	}
}
*/
public class GenericDemo {
	public static void main(String[] args) {
/*		StudentInfo si=new StudentInfo(2);
		StudentPerson sp=new StudentPerson(si);
		System.out.println(sp.info.grade);
		
		EmployeeInfo ei=new EmployeeInfo(1);
		EmployeePerson ep=new EmployeePerson(ei);
		System.out.println(ep.info.rank);

		//step 2.
		Person p1=new Person("����");
		EmployeeInfo ei= (EmployeeInfo)p1.info;
		System.out.println(ei.rank);
*/
		Integer id= new Integer(1);
		Person<EmployeeInfo, Integer> p1=new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),id);
		
		//Person<EmployeeInfo, int> p1=new Person<EmployeeInfo, int>(new EmployeeInfo(1),1);
	}
}
