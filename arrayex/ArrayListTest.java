package arrayex;

import java.util.ArrayList;
//import ����Ű :ctrl+shift+o

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
//� ��ü�� ����Ұ��ΰ�?<> �ȿ� �ֱ�
		
		list.add("aaa");
		list.add("bbb");
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(str);
		}
	}

}
