//�����尣�� ������ ��ȯ

class SharedArea{  //������ ��ȯ�� ���Ǵ� ��������(���۷��� Ÿ��)
	double result;  //���� �����͸� ������ �ʵ�
	volatile boolean isReady; 
	//isReady �ʵ尪�� ü
	
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
class CalcThread extends Thread{  //���̸� ����ϴ� ������ Ŭ����
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
		sharedArea.isReady = true; //SharedArea ��ü�� isReady �ʵ� ���� true�� �����մϴ�.
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