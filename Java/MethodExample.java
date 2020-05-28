
public class MethodExample {
	public static void main(String args[]) {
		int arr[]=  new int[0];
		
		Numbers obj=new Numbers(arr);
		int total= obj.getTotal();
		System.out.println("합계="+total);
		try {
			int average=obj.getAverage();
			System.out.println("평균="+average);
		}
		catch(java.lang.ArithmeticException e) {
			System.out.println("평균을 계산하는 도중 에러가 발생했습니다.");
			//throw new Exception("에러발생"); 인위적으로 익셉션 발생시킬경우.
			//withdraw() 익셉션을 발생시키는 메소드
		}
		
	}
}
