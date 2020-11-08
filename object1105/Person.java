package object1105;

public class Person {
	String name;
	int money;
	
	public Person(String name, int money){
		this.name=name;
		this.money=money;
	}
	public void buyStarCoffee(StarCoffee starcoffe, int money){
		String message=starcoffe.brewing(money);
		if(message !=null){
			this.money -=money;
			System.out.println(name+"님은 "+money +"원으로 "+message);
		}
	}
	
	public void buyBeanCoffee(BeanCoffee beancoffee, int money){
		String message=beancoffee.brewing(money);
		if(message !=null){
			this.money -=money;
			System.out.println(name+"님은 "+money +"원으로 "+message);
		}
	}
}
