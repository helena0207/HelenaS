package objArray;
// 메소드 오버라이딩으로 다형성 실현
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{

	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{

	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class CircleCl extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
public class MethodOverridingEx {

	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line=new Line();
		
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect()); 
		paint(new CircleCl());
	}

}
