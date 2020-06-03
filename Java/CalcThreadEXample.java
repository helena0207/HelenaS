//스레드간의 데이터 교환

class SharedArea{  //데이터 교환에 사용되는 공유영역(레퍼런스 타입)
	double result;  //공유 데이터를 저장할 필드
	volatile boolean isReady; 
	//isReady 필드값을 체
	
	}

public class CalcThreadEXample {
	public static void main(String[] args) {
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 =new PrintThread();
		SharedArea obj = new SharedArea();
		
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		thread1.start();
		thread2.start();
	}
}
class CalcThread extends Thread{  //파이를 계산하는 스레드 클래스
	SharedArea sharedArea;
	public void run() {
		double total=0.0;
		for(int cnt=1; cnt<1000000000; cnt +=2) {
			if(cnt/2%2 == 0) {
				total +=1.0/cnt;
			}else {
				total -=1.0/cnt;
			}
		}
		sharedArea.result = total*4;
		sharedArea.isReady = true; //SharedArea 객체의 isReady 필드 값을 true로 설정합니다.
	}
}
class PrintThread extends Thread{
	SharedArea sharedArea;
	public void run() {
		while(sharedArea.isReady != true) {
			continue;
		}
		System.out.println(sharedArea.result);
	}
}