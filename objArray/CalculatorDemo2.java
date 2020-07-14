package objArray;

class Calculator3 {
	int left, right;

	public void setOprands(int left, int right) {
		//if(right == 0) {  //API 생산자로서 소비자들에게 API를 제공하는 입장으로 예외생성.
		//	throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
		//}
		this.left = left;
		this.right = right;
	}

	public void devide() {
		if( this.right == 0) {
			throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
		}
		try {
			System.out.print("계산결과는 ");
			System.out.print(this.left / this.right);
			System.out.print("입니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다." + e.getMessage());
			System.out.println("\n\n e.getMessage()\n" + e.getMessage());
			System.out.println("\n\n e.tostring()\n" + e.toString());
			System.out.println("\n\n e.printStackTrace()\n");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

public class CalculatorDemo2 {

	public static void main(String[] args) {
		Calculator3 c1 = new Calculator3();
		c1.setOprands(10, 0);
		try {
			c1.devide();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
