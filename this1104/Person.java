package this1104;

public class Person{
	String name;
	int age;
	//��������� �ʱ�ȭ�� ���ϸ� String�� NULL, int�� 0���� �ʱ�ȭ �ȴ�.
	public Person(){
		this("�̸�����",1); //�Ű������� 2���� �ٸ� �����ڸ� ����Ŵ
	}
	
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	
	}
	public void showInfo(){
		System.out.println("�̸�: "+name+" ����: "+age);
	}
	
	public Person getSelf(){
		return this;
	}
	
}
