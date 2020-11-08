package object1104;

public class Player {
	int number=0; //찍은 숫자를 저장할 변수
	
	public void guess(){ //숫자를 찍기위한 메소드
		number=(int)(Math.random()*10);
		System.out.println("찍은 숫자 : "+ number);
	}
}
