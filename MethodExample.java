
public class MethodExample {
	public static void main(String args[]) {
		int arr[]=  new int[0];
		
		Numbers obj=new Numbers(arr);
		int total= obj.getTotal();
		System.out.println("�հ�="+total);
		try {
			int average=obj.getAverage();
			System.out.println("���="+average);
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("����� ����ϴ� ���� ������ �߻��߽��ϴ�.");
		}
	}
}
