import java.lang.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassName {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(10,20);
		Class cls=obj.getClass();
		String name=cls.getName();
		System.out.println("Ŭ���� �̸� : " + name);
		
		Class superCls = cls.getSuperclass();
		String superName = superCls.getName();
		System.out.println("����Ŭ���� �̸� : " + superName);
		
		Field[] field = cls.getDeclaredFields();//Ŭ������ ����� �ʵ� ������ �������� �޼ҵ�
		System.out.println("�ʵ� : ");
		for(int cnt=0; cnt<field.length ; cnt++) {
			System.out.println("   " +field[cnt]);
		}
		Method method[]=cls.getDeclaredMethods();
		System.out.println("�޼ҵ� : ");
		for(int cnt=0 ; cnt<method.length ; cnt++)
		{
			System.out.println("   " + method[cnt]);
		}
	}

}
class Rectangle{ //���簢�� Ŭ����
	int width, height;
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	int getArea() {
		return width*height;
	}
}