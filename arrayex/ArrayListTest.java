package arrayex;

import java.util.ArrayList;
//import 단축키 :ctrl+shift+o

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
//어떤 객체를 사용할것인가?<> 안에 넣기
		
		list.add("aaa");
		list.add("bbb");
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(str);
		}
	}

}
