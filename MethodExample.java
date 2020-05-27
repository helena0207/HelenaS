
public class MethodExample {
	public static void main(String args[]) {
		int arr[]= {10,20,30,40,50,60,70};
		
		Numbers obj=new Numbers(arr);
		int total= obj.getTotal();
		int average=obj.getAverage();
		
		System.out.println("ÇÕ°è="+total);
		System.out.println("Æò±Õ="+average);
	}
}
