package object1105;

public class Bus {
	int busNum;
	int passengerCount;
	int money;
	
	public Bus(int busNum){
		this.busNum=busNum;
	}
	
	public void take(int money){//����
		this.money +=money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println(busNum+"�� ������ �°��� "+ passengerCount+ "������ " + money);
	}
}
