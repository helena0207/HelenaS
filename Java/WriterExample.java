import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			writer=new FileWriter("softwareTest.txt");
			char arr[]= {'��','��','��','��','!','��','��'};
			
			for(int cnt=0;cnt <arr.length;cnt++)
			{
				writer.write(arr[cnt]);
			}
		}catch(IOException ioe) {
			System.out.println("���Ϸ� ����Ҽ� �����ϴ�.");
		}
		
		finally {
			try {
				writer.close();
			}
			catch(Exception e){
			}
		}

	}

}
