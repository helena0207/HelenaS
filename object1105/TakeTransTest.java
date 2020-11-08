package object1105;

public class TakeTransTest {

	public static void main(String[] args) {

		Person kim =new Person("kim",10000);
		Person Lee=new Person("Lee", 10000);
		
		StarCoffee starcoffee=new StarCoffee();
		BeanCoffee beancoffee=new BeanCoffee();
		
		kim.buyStarCoffee(starcoffee, Menu.STARAMERICANO);
		Lee.buyBeanCoffee(beancoffee, Menu.BEANLATTE);
		
		/*		Student studentJ=new Student("James",5000);
		Student studentT=new Student("Tomas",10000);
		Student studentE=new Student("Edward",10000);
		
		Bus bus100=new Bus(100);
		Bus bus500=new Bus(500);
		
		Subway subwayGreen=new Subway(2);
		Subway subwayBlue=new Subway(4);
		
		Taxi taxi1=new Taxi(1);
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		studentE.takeTaxi(taxi1);
		
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showInfo();
		subwayGreen.showSubwayInfo();
		taxi1.showTaxiInfo();
*/
		
	}

}
