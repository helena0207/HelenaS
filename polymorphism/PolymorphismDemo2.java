package polymorphism;

interface I2{
	public String A();
}
interface I3{
	public String B();
}
class D implements I2, I3{ //강제로 구현되어야 한다.
	public String A(){
		System.out.println("A");
		return "A";
	}
	public String B(){
		System.out.println("B");
		return "B";
	}
}
//class C implements PolymorphismDemo2{} //구현하고 있다.

public class PolymorphismDemo2{
	public static void main(String[] args){
		//I obj=new C();
		D obj =new D();
		I2 objI2=new D();
		I3 objI3=new D();
		
		obj.A(); obj.B();
		objI2.A();
		//objI2.B(); //I2 인터페이스는 A()메서드만 호출가능
		
		//objI3.A();
		objI3.B();
	}
}
