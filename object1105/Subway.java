package object1105;

public class Subway {
	int lineNum;
	int passengerCount;
	int money;
	
	public Subway(int lineNum){
		this.lineNum=lineNum;
	}
	public void take(int money){
		this.money += money;
		passengerCount++;
	}
	public void showSubwayInfo(){
		System.out.println(lineNum+"¹ø ÁöÇÏÃ¶ÀÇ ½Â°´Àº "+passengerCount+" ¼öÀÔÀº "+money);
	}
	
}
