import java.io.File;
import java.util.GregorianCalendar;

public class ToStringExample {

	public static void main(String[] args) {
		//File file = new File("c:\\Program File\\");
		GoodsStock obj=new GoodsStock("57293", 1000);
		String str=obj.toString();//��ü�� ������ �ִ� ���� ���ڿ��� �ٲ۴�.
		System.out.println(str);
		
////////////////////////////////////
		GregorianCalendar obj1 = new GregorianCalendar(2007,0,1);
		GregorianCalendar obj2 = new GregorianCalendar(2007,0,1);
		if(obj1.equals(obj2))
		{
			System.out.println("Same");
		}else{
			System.out.println("Different");
		}
////////////////////////////////		
		Circle obj3 = new Circle(5);
		Circle obj4 = new Circle(5);
		if(obj3.equals(obj4)) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
	}//main
}

class GoodsStock{
	String goodsCode;
	int stockNum;
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	public String toString() {
		String str="��ǰ�ڵ� : " + goodsCode +"  ������ : "+ stockNum;
		return str;
	}
}
class Circle{
	int radius;//������
	Circle(int radius){
		this.radius = radius;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)) {
			return false;
		}
		Circle circle = (Circle)obj;
		if(radius == circle.radius) {
			return true;
		}else {
			return false;
		}
	}
}