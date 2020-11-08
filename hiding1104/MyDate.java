package hiding1104;

public class MyDate {
	 private int day; 
	 private int month;
	 private int year;
	/*public , static 같은 접근제어자를 안쓰는 default일경우
	 * 같은 package에서만 접근 가능하다.
	 * 그러므로 다른 package에서 접근 가능하도록public으로 
	 */
	 private boolean isValid; //boolean은 무조건 초기값은 false
	 
/*
 * setDay()같은 setter를 제공안하므로써 입력을 오류를 방지
 */
	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}
	//자신의 메모리를 가리킴
	//생성자에서 다른 생성자를 호출함
	//인스턴스 자신의 주소를 반환

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
			 System.out.println(year+"년"+month+"월"+day+"일");
		 }else{
			 System.out.println("유효하지 않은 날짜 입니다.");
		 }
	 }

}
