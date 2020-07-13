package objArray;
class ShapeClass{
	
	public ShapeClass next;
	public ShapeClass() {
		next=null;
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class LineClass extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class RectClass extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class CircleClass extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
public class UsingOverride {

	public static void main(String[] args) {
		ShapeClass start, last, obj;
		//링크드 리스트로 도형 생성하여 연결 
		start=new LineClass();
		last=start;
		
		obj=new RectClass();
		last.next=obj;
		last=obj;
		
		obj=new LineClass();
		last.next=obj;
		last=obj;
		
		obj=new CircleClass();
		last.next=obj;
		
		ShapeClass p=start;
		while(p !=null) {
			p.draw();
			p=p.next;
		}
	}
}
