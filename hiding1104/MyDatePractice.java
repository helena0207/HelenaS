package hiding1104;

public class MyDatePractice {
	private int day;
	private int month;
	private int year;
	boolean isValid;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch(month){ 
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day <0 || day>31){
				isValid =false;
			}else{
				this.day=day;
				isValid=true;
			}
			break;
	
		case 4: case 6: case 9: case 11:
			if(day <0 || day >30){
				isValid=false;
			}else{
				this.day=day;
				isValid=true;
			}
			break;
		case 2 :
			//((year %4==0 && year%100 !=0) || year%400==0)- 윤년공식
			if((year %4==0 && year%100 !=0) || year%400==0){
				if(day >29){
					isValid=false;
				}else{
					this.day=day;
					isValid=true;
				}
			}
			break;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {

		if(month < 1 || month >12){
			isValid=false;
		}else{
			this.month=month;
			isValid=true;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public void showIsValid(){
		if(isValid){
			System.out.println("유효한 날짜입니다.");

		}else{
			System.out.println("유효하지 않습니다.");
		}
	}
	
}
