package objArray;

class Calculator3 {
	int left, right;

	public void setOprands(int left, int right) {
		//if(right == 0) {  //API �����ڷμ� �Һ��ڵ鿡�� API�� �����ϴ� �������� ���ܻ���.
		//	throw new IllegalArgumentException("�ι�° ������ ���� 0�� �� �� �����ϴ�.");
		//}
		this.left = left;
		this.right = right;
	}

	public void devide() {
		if( this.right == 0) {
			throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");
		}
		try {
			System.out.print("������� ");
			System.out.print(this.left / this.right);
			System.out.print("�Դϴ�.");
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�." + e.getMessage());
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
