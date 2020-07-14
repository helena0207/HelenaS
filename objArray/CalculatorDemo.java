package objArray;
abstract class Calculator{ //상속을 반드시 해야 한다.
	int left, right;
	public void setOprands(int left, int right) {
		this.left=left;
		this.right=right;
	}
	int _sum() {
		return this.left+this.right;
	}
	int _avg() {
		return (this.left+this.right)/2;
	}
	public abstract void sum(); //자식 클래스에서 반드시 정의해야 한다.
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
}
class CalculatorDecoPlus extends Calculator{
	public void sum() {
		System.out.println("+ sum :" +_sum());
	}
	public void avg() {
		System.out.println("+ avg :" + _avg());
	}
}
class CalculatorDecoMinus extends Calculator{
	public void sum() {
		System.out.println("- sum :" + _sum());
	}
	public void avg() {
		System.out.println("- avg :" + _avg());
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		CalculatorDecoPlus c1= new CalculatorDecoPlus();
		c1.setOprands(10,20);
		c1.run();

		CalculatorDecoMinus c2=new CalculatorDecoMinus();
		c2.setOprands(10,20);
		c2.run();
	}

}
