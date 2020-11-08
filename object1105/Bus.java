package object1105;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNum){
		this.busNum=busNum;
	}
	
	public void take(int money){//½ÂÂ÷
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println(busNum+"¹ø ¹ö½ºÀÇ ½Â°´Àº "+ passengerCount+ "¼öÀÔÀº " + money);
	}
}
