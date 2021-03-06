interface Lendable {
	abstract void checkOut(String aborrower, String date) throws Exception;//대출한다.
	abstract void checkIn();//반납한다.
}
//#####################################
class CDInfo{
	String registerNo;		//관리번호
	String title;					//타이들
	CDInfo(String registerNo, String title){
		this.registerNo=registerNo;
		this.title=title;
	}
}
//###################################
class SeparateVolume implements Lendable{

	String requestNo;		//청구번호
	String bookTitle;			//책제목
	String writer;				//저자
	String borrower;			 //대출인
	String checkOutDate;	//대출일
	byte state;					//대출상태

	
	
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo=requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
	}
	public void checkOut(String borrower, String date) throws Exception{//public : 인터페이스를 구현할때 반드시 써야 하는 키워드
		if(state !=0) {
			throw new Exception("* 대출불가 :"+ bookTitle);
		}
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=1;
		System.out.println("*"+bookTitle+"이(가) 대출되었습니다.");
		System.out.println("대출인"+borrower);
		System.out.println("대출일 : "+ date);
		
	}

	
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("*"+bookTitle+"이(가) 반납되었습니다.");
		
	}	
}
//######################################

class AppCDInfo extends CDInfo implements Lendable{

	String borrower;		//대출인
	String checkOutDate; //대출일
	byte state;
	AppCDInfo(String registerNo, String title){
		super(registerNo, title);
	}
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state !=0) {
			return;
		}
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=1;
		System.out.println("*"+title+"CD가 대출되었습니다.");
		System.out.println("대출인 : "+borrower);
		System.out.println("대출일 :"+date);
	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("*"+title+"CD가 반납되었습니다.");
	}
	
}