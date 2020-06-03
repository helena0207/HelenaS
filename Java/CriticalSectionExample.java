//�������� Ŭ����
class SharedArea{
	Account account1;  //������ ����
	Account account2;  //������ ����
}
public class CriticalSectionExample {
	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","������", 20000000);
		area.account2 = new Account("222-222-2222", "������",10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}//main
}
//������ü�� �����ϴ� ������
class TransferThread extends Thread{
	SharedArea sharedArea;
	TransferThread (SharedArea area){
		sharedArea = area;
	}
	public void run() {
		for(int cnt=0; cnt <12; cnt++) {
			//critical section�� ����ȭ �ؾ� �Ѵ�. ����ȭ�� synchronized��� Ű���带 ����Ѵ�.
			//synchronized Ű���带 �ٿ� ������� ���� �κ��� ����ȭ ����̶�� �Ѵ�.
			synchronized(sharedArea) {
				sharedArea.account1.withdraw(1000000); 
				System.out.println("������ ���� :100���� ����");
				sharedArea.account2.deposit(1000000);
				System.out.println("������ ���� : 100���� �Ա�");
			}
		}
	}
}
//���� �ܾ� �հ踦 ����ϴ� ������ Ŭ����
class PrintThread extends Thread{
	SharedArea sharedArea;
	PrintThread(SharedArea area){
		sharedArea = area;
	}
	public void run() {
		for(int cnt=0; cnt <3 ; cnt ++) {
			//critical section�� synchronizedŰ����� ������� ���� ����ȭ ����� �����.
			synchronized(sharedArea) {
				int sum = sharedArea.account1.balance + sharedArea.account2.balance;
				System.out.println("���� �ܾ� �հ� : " + sum);
			}
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class Account{
	String accountNo; 	//���¹�ȣ
	String ownerName; //������ �̸�
	int balance;     		//�ܾ�
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	void deposit(int amount) {
		balance += amount;
	}
	int withdraw(int amount) {
		balance -= amount;
		return amount;
	}
	
}