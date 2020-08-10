package reference;

public class Company {
	private static Company instance=new Company();
	
	private Company(){
		
	}
	//�ܺο��� ���� �Ҽ� �ֵ��� �޼��� ����
	//static �� �ؾ߸� �����ڰ� �����Ϳ����� ���� ���� �Ǿ� �ִ� ���� ������ ���� ����.
	public static Company getInstance(){
		if(instance==null){
			instance=new Company();
		}
		return instance;
		
	}
}
