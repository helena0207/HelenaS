package problem2drink;

public class Worker {
	String workerName;
	int money;
	
	public Worker(String workerName, int money) {
		this.workerName=workerName;
		this.money=money;
	}
	
	public void buyStarCoffee(StarCoffee starcoffee, int menuprice){
		System.out.println(workerName+"님이 별다방에서 아메리카노를 "+menuprice+"에 구입했습니다.");
	}
	public void buyBeanCoffee(BeanCoffee beancoffee, int menuprice){
		System.out.println(workerName+"님이 콩다방에서 아메리카노를 "+menuprice+"에 구입했습니다.");
	}
}
