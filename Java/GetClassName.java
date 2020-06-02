import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassName {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10,20);
		Class cls=obj.getClass();
		String name=cls.getName();
		System.out.println("클래스 이름 : " + name);
		
		Class superCls = cls.getSuperclass();
		String superName = superCls.getName();
		System.out.println("슈퍼클래스 이름 : " + superName);
		
		Field[] field = cls.getDeclaredFields();//클래스에 선언된 필드 정보를 가져오는 메소드
		System.out.println("필드 : ");
		for(int cnt=0; cnt<field.length ; cnt++) {
			System.out.println("   " +field[cnt]);
		}
		Method method[]=cls.getDeclaredMethods();
		System.out.println("메소드 : ");
		for(int cnt=0 ; cnt<method.length ; cnt++)
		{
			System.out.println("   " + method[cnt]);
		}
	}

}
class Rectangle{ //직사각형 클래스
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width*height;
	}
}