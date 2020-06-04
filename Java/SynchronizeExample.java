//공유 영역 클래스
class SharedArea{
	Account account1; 		//개똥이 계좌
	Account account2;		//말똥이 계좌
	synchronized void transfer(int amount) {//계좌이체를 한다
		//synchronized(this) {
			account1.withdraw(1000000);
			System.out.println("개똥이 계좌 : 100만원 인출");
			account2.deposit(1000000);
			System.out.println("말똥이 계좌 : 100만원 입금");
		//}
	}
	synchronized int getTotal()				//잔액 합계를 구한다.
	{
		//synchronized(this) {
			return account1.balance + account2.balance ;
		//}
	}
}
//main 메소드
public class SynchronizeExample {

	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","개똥이",20000000);
		area.account2 = new Account("222-222-2222","말똥이",10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		
		thread1.start();
		thread2.start();
		
	}//main
}

class Account{
	String accountNo;		//계좌번호
	String ownerName;		//예금주 이름
	int balance;				//잔액
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
//계좌 이체를 수행하는 스레드
class TransferThread extends Thread{
	SharedArea sharedArea;
	TransferThread(SharedArea area){
		sharedArea = area;
	}
	public void run() {
		for(int cnt=0; cnt<12;cnt++) {
			sharedArea.transfer(100);		//계좌이체 메소드 호출
		}
	}
}
//계좌 잔액 합계를 출력하는 스레드 클래스
class PrintThread extends Thread{
	SharedArea sharedArea;
	PrintThread(SharedArea area){
		sharedArea = area;
	}
	public void run() {
		for(int cnt=0; cnt<3; cnt++) {
			int sum = sharedArea.getTotal();		//잔액 합계 메소드 호출
			System.out.println("계좌 잔액 합계 : " + sum);
			try {
				Thread.sleep(1);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
}