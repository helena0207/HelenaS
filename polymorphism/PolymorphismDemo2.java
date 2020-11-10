package polymorphism;

interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{ //������ �����Ǿ�� �Ѵ�.
	public String A(){
		System.out.println("A");
		return "A";
	}
	public String B(){
		System.out.println("B");
		return "B";
	}
}
//class C implements PolymorphismDemo2{} //�����ϰ� �ִ�.

public class PolymorphismDemo2{
	public static void main(String[] args){
		//I obj=new C();
		D obj =new D();
		I2 objI2=new D();
		I3 objI3=new D();
		
		obj.A(); obj.B();
		objI2.A();
		//objI2.B(); //I2 �������̽��� A()�޼��常 ȣ�Ⱑ��
		
		//objI3.A();
		objI3.B();
	}
}
