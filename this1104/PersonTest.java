package this1104;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personName=new Person();
		personName.showInfo();
		Person n=personName.getSelf();
		System.out.println(n);
		
		Person personLee=new Person("Lee",27);
		personLee.showInfo();
		System.out.println(personLee);
		//참조변수를 가르킨다.
		
		Person p=personLee.getSelf();
		System.out.println(p);
	}

}
