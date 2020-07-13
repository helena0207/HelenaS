package objArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] members= {"개똥이", "소똥이", "말똥이"};
		for(String e : members) {
			System.out.println(e + "이(가) 상담을 받았습니다.");
		}
	/*	try {
			File file=new File("out.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		try {
			File file=new File("out.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextInt()) {
				System.out.println(sc.nextInt()*1000);
			}
			sc.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
