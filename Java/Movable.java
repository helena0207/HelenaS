interface Movable {
	void moveTo(int x, int y); //절대 위치로 이동한다.
	void moveBy(int xOffset, int yOffset); //상대 위치 만큼 이동한다.
}

interface Transformable extends Movable{
	void resize(int width, int height);
}

class Rectangle implements Transformable{
	int x,y, width,height;
	Rectangle(int x, int y, int width, int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	@Override
	public void moveTo(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public void moveBy(int xOffset, int yOffset) {
		this.x +=xOffset;
		this.y +=yOffset;
	}
	@Override
	public void resize(int width, int height) {
		this.width=width;
		this.height=height;
		
	}
}

class InterfaceExample{
	public static void main(String arg[]) {
		Rectangle obj=new Rectangle(100,200,10,10);
		printRectangle(obj);
		
		obj.moveTo(25,35);
		printRectangle(obj);
		
		obj.moveBy(-5, -5);
		printRectangle(obj);
		
		obj.resize(30, 30);
		printRectangle(obj);
	}
	static void printRectangle(Rectangle obj) {
		System.out.printf("사각형 : 위치 (%d, %d) 크기 (%d x %d) %n", obj.x, obj.y, obj.width, obj.height);
	}
}