//���� ���� Ŭ����
class SharedArea{
	Account account1; 		//������ ����
	Account account2;		//������ ����
	synchronized void transfer(int amount) {//������ü�� �Ѵ�
		//synchronized(this) {
			account1.withdraw(1000000);
			System.out.println("������ ���� : 100���� ����");
			account2.deposit(1000000);
			System.out.println("������ ���� : 100���� �Ա�");
		//}
	}
	synchronized int getTotal()				//�ܾ� �հ踦 ���Ѵ�.
	{
		//synchronized(this) {
			return account1.balance + account2.balance ;
		//}
	}
}
//main �޼ҵ�
public class SynchronizeExample {

	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","������",20000000);
		area.account2 = new Account("222-222-2222","������",10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		
		thread1.start();
		thread2.start();
		
	}//main
}

class Account{
	String accountNo;		//���¹�ȣ
	String ownerName;		//������ �̸�
	int balance;				//�ܾ�
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return amount;
	}
}
//���� ��ü�� �����ϴ� ������
class TransferThread extends Thread{
	SharedArea sharedArea;
	TransferThread(SharedArea area){
		sharedArea = area;
	}
	public void run() {
		for(int cnt=0; cnt<12;cnt++) {
			sharedArea.transfer(100);		//������ü �޼ҵ� ȣ��
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
		for(int cnt=0; cnt<3; cnt++) {
			int sum = sharedArea.getTotal();		//�ܾ� �հ� �޼ҵ� ȣ��
			System.out.println("���� �ܾ� �հ� : " + sum);
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}