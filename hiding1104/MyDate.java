package hiding1104;

public class MyDate {
	 private int day; 
	 private int month;
	 private int year;
	/*public , static ���� ���������ڸ� �Ⱦ��� default�ϰ��
	 * ���� package������ ���� �����ϴ�.
	 * �׷��Ƿ� �ٸ� package���� ���� �����ϵ���public���� 
	 */
	 private boolean isValid; //boolean�� ������ �ʱⰪ�� false
	 
/*
 * setDay()���� setter�� �������ϹǷν� �Է��� ������ ����
 */
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}
	//�ڽ��� �޸𸮸� ����Ŵ
	//�����ڿ��� �ٸ� �����ڸ� ȣ����
	//�ν��Ͻ� �ڽ��� �ּҸ� ��ȯ

	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
		if(month <1 || month >12){
			isValid=false;
		}else{
			isValid=true;
		}
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	 public void showDate(){
		 if(isValid){
			 System.out.println(year+"��"+month+"��"+day+"��");
		 }else{
			 System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
		 }
	 }

}
