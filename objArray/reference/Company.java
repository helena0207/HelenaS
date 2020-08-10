package reference;

public class Company {
	private static Company instance=new Company();
	
	private Company(){
		
	}
	//외부에서 접근 할수 있도록 메서드 생성
	//static 을 해야만 생성자가 데이터영역에 먼저 생성 되어 있는 것을 가져다 쓸수 있음.
	public static Company getInstance(){
		if(instance==null){
			instance=new Company();
		}
		return instance;
		
	}
}
