
public class InterfaceExample {

	public static void main(String[] args) {
		Lendable arr[]=new Lendable[3];
		arr[0]=new SeparateVolume("883o326��2","Ǫ���� ����","����");
		arr[1]=new SeparateVolume("609��428��","�����ǹ̼���","���긮ġ");
		arr[2]=new AppCDInfo("2002-1742","XML�� ���� �ڹ� ���α׷���");
		checkOutAll(arr,"������","20063015");
		//�迭�� �Ķ���ͷ� �Ѱ��ݴϴ�.
	}
	static void checkOutAll(Lendable arr[], String borrower, String date) {
		for(int cnt=0; cnt<arr.length; cnt++) {
			arr[cnt].checkOut(borrower, date);//�迭�� ��� �׸� ���� checkOut�޼ҵ� ȣ��
		}
	}
}
