package objArray;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade=grade;
	}
}
/*
class StudentPerson{  //메카니즘이 같음. 타입이 안전하다.
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
class Person<T, S>{ //int, char 같은 데이터 타입으로 지정하면 안된다. 객체 변수를 사용해야함.
	public T info;
	public S id;
	Person(T info, S id){
		this.info=info;
		this.id=id;
	}
	public<U> void printInfo(U info) {
		System.out.println(info);
	}
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank=rank;
	}
}
/*
class EmployeePerson{  //메카니즘이 같음. 타입이 안전하다.
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
		Person p1=new Person("부장");
		EmployeeInfo ei= (EmployeeInfo)p1.info;
		System.out.println(ei.rank);
*/
		EmployeeInfo e=new EmployeeInfo(1);
		Integer id= new Integer(10);
		Person<EmployeeInfo, Integer> p1=new Person<EmployeeInfo, Integer>(e, id);
				
		System.out.println(p1.info.rank);
		System.out.println(p1.id.intValue());
		p1.<EmployeeInfo>printInfo(e);
		
		//Person<EmployeeInfo, int> p1=new Person<EmployeeInfo, int>(new EmployeeInfo(1),1);
	}
}
