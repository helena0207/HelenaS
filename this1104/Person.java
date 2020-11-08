package this1104;

public class Person{
	String name;
	int age;
	//멤버변수는 초기화를 안하면 String은 NULL, int는 0으로 초기화 된다.
	public Person(){
		this("이름없음",1); //매개변수가 2개인 다른 생성자를 가리킴
	}
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	
	}
	public void showInfo(){
		System.out.println("이름: "+name+" 나이: "+age);
	}
	
	public Person getSelf(){
		return this;
	}
	
}
