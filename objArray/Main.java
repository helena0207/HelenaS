package objArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] members= {"������", "�Ҷ���", "������"};
		for(String e : members) {
			System.out.println(e + "��(��) ����� �޾ҽ��ϴ�.");
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
