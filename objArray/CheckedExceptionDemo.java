package objArray;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		BufferedReader bReader=null;
		String input=null;
		try { //강제로 예외 처리가 꼭 되어야 함. F1-> API를 참고 하여 확인할수 있슴.
			bReader = new BufferedReader(new FileReader("out.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
		
	}

}
