package object1104;

public class Player {
	int number=0; //���� ���ڸ� ������ ����
	
	public void guess(){ //���ڸ� ������� �޼ҵ�
		number=(int)(Math.random()*10);
		System.out.println("���� ���� : "+ number);
	}
}
