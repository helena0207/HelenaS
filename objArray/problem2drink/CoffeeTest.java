package problem2drink;

public class CoffeeTest {

	public static void main(String[] args) {

		Worker workerKim=new Worker("kim",10000);
		Worker workerLee=new Worker("Lee",5000);
		
		StarCoffee starcoffee=new StarCoffee();
		BeanCoffee beancoffee=new BeanCoffee();
		
		workerKim.buyStarCoffee(starcoffee, 4000);
		workerLee.buyBeanCoffee(beancoffee, 4500);

	}

}
