package problem2drink;

public class Worker {
	String workerName;
	int money;
	
	public Worker(String workerName, int money) {
		this.workerName=workerName;
		this.money=money;
	}
	
	public void buyStarCoffee(StarCoffee starcoffee, int menuprice){
		System.out.println(workerName+"���� ���ٹ濡�� �Ƹ޸�ī�븦 "+menuprice+"�� �����߽��ϴ�.");
	}
	public void buyBeanCoffee(BeanCoffee beancoffee, int menuprice){
		System.out.println(workerName+"���� ��ٹ濡�� �Ƹ޸�ī�븦 "+menuprice+"�� �����߽��ϴ�.");
	}
}
