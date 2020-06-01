interface Lendable {
	abstract void checkOut(String aborrower, String date);//�����Ѵ�.
	abstract void checkIn();//�ݳ��Ѵ�.
}
//#####################################
class CDInfo{
	String registerNo;		//������ȣ
	String title;					//Ÿ�̵�
	CDInfo(String registerNo, String title){
		this.registerNo=registerNo;
		this.title=title;
	}
}
//###################################
class SeparateVolume implements Lendable{

	String requestNo;		//û����ȣ
	String bookTitle;			//å����
	String writer;				//����
	String borrower;			 //������
	String checkOutDate;	//������
	byte state;					//�������

	
	
	SeparateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo=requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
	}
	public void checkOut(String borrower, String date) {//public : �������̽��� �����Ҷ� �ݵ�� ��� �ϴ� Ű����
		if(state !=0) {
			return;
		}
		this.borrower=borrower;
		this.checkOutDate=date;
		this.state=1;
		System.out.println("*"+bookTitle+"��(��) ����Ǿ����ϴ�.");
		System.out.println("������"+borrower);
		System.out.println("������ : "+ date);
		
	}

	
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("*"+bookTitle+"��(��) �ݳ��Ǿ����ϴ�.");
		
	}	
}
//######################################

class AppCDInfo extends CDInfo implements Lendable{

	String borrower;		//������
	String checkOutDate; //������
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
		System.out.println("*"+title+"CD�� ����Ǿ����ϴ�.");
		System.out.println("������ : "+borrower);
		System.out.println("������ :"+date);
	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
		System.out.println("*"+title+"CD�� �ݳ��Ǿ����ϴ�.");
	}
	
}