import java.io.*;


public class FileDump {

	public static void main(String[] args) {
		
		BufferedInputStream in=null;
		try {
			in=new BufferedInputStream(new FileInputStream("output.dat"),1024);
			byte arr[]=new byte[16];
			while(true) {
				int num=in.read(arr);
				if(num<0) {
					break;
				}
				for(int cnt=0; cnt<num; cnt++) {
					System.out.printf("%02X ",arr[cnt]);
					if((cnt +1) % 10==0) {
						System.out.println();
					}
				}
				
			}
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		finally {
			try {
				in.close();
			}catch(Exception e) {
			}
		}
		
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter("output.txt"));
			char arr[]= {'L','O','V','E',' ', 'J','A','V','A','!'};
			for(int cnt=0; cnt<arr.length; cnt++) {
				writer.write(arr[cnt]);
			}
		}catch(IOException ioe) {
			System.out.println("������ ����Ҽ� �����ϴ�.");
		}
		finally {
			try {
				writer.close();
			}catch(Exception e) {
				
			}
		}
	}//main

}
