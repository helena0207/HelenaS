package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber){
		this.busNumber=busNumber;
	}
	
	public void take(int money){//승차
		this.money+=money;
		passengerCount++;
	}
	public void showBusInfo(){
		System.out.println("버스 번호 : "+busNumber + "  수입 :"+money);
	}
}
