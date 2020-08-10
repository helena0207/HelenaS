package array;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabts=new char[26];
		char ch='A';
		
		for(int i=0;i<alphabts.length;i++){
			alphabts[i]= ch++;
		}
		for(int i=0;i<alphabts.length;i++){
			System.out.println(alphabts[i]);
		}
		

	}

}
