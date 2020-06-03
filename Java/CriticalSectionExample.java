//공유영역 클래스
class SharedArea{
	Account account1;  //개똥이 계좌
	Account account2;  //말똥이 계좌
}
public class CriticalSectionExample {
	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		area.account1 = new Account("111-111-1111","개똥이", 20000000);
		area.account2 = new Account("222-222-2222", "말똥이",10000000);
		TransferThread thread1 = new TransferThread(area);
		PrintThread thread2 = new PrintThread(area);
		thread1.start();
		thread2.start();
	}//main
}
//계좌이체를 수행하는 스레드
class TransferThread extends Thread{
	SharedArea sharedArea;
	TransferThread (SharedArea area){
		sharedArea = area;
	}
	public void run() {
		for(int cnt=0; cnt <12; cnt++) {
			//critical section을 동기화 해야 한다. 동기화는 synchronized라는 키워드를 사용한다.
			//synchronized 키워드를 붙여 블록으로 묶은 부분을 동기화 블록이라고 한다.
			synchronized(sharedArea) {
				sharedArea.account1.withdraw(1000000); 
				System.out.println("개똥이 계좌 :100만원 인출");
				sharedArea.account2.deposit(1000000);
				System.out.println("말똥이 계좌 : 100만원 입금");
			}
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
		for(int cnt=0; cnt <3 ; cnt ++) {
			//critical section을 synchronized키워드로 블록으로 묶어 동기화 블록을 만든다.
			synchronized(sharedArea) {
				int sum = sharedArea.account1.balance + sharedArea.account2.balance;
				System.out.println("계좌 잔액 합계 : " + sum);
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
	String accountNo; 	//계좌번호
	String ownerName; //예금주 이름
	int balance;     		//잔액
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