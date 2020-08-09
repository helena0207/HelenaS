package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		object_Student studentJ= new object_Student("James",5000);
		object_Student studentT= new object_Student("Tomas",10000);
		object_Student studentE=new object_Student("Edword",20000);
		
		Bus bus100=new Bus(100);
		Bus bus500=new Bus(500);
				
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue= new Subway(4);
		
		Taxi taxi258=new Taxi(258);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTaxi(taxi258);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showInfo();
		taxi258.showTaxiInfo();
	}

}
