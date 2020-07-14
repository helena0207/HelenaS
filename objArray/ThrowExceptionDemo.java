package objArray;

import java.io.*;

class B {
	void run() throws FileNotFoundException, IOException{
		BufferedReader bReader = null;
		String input = null;
		//try {
			bReader = new BufferedReader(new FileReader("out.txt"));
		//} catch (FileNotFoundException e) {
		//	e.printStackTrace();
		//}
		//try {
			input = bReader.readLine();
		//} catch (IOException e) {
		//	e.printStackTrace();
		//}
		System.out.println(input);
	}
}

class C {
	void run() throws FileNotFoundException, IOException{
		B b = new B();
		b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
