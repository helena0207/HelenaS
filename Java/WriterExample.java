import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {

	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			writer=new FileWriter("softwareTest.txt");
			char arr[]= {'할','수','있','다','!','자','바'};
			
			for(int cnt=0;cnt <arr.length;cnt++)
			{
				writer.write(arr[cnt]);
			}
		}catch(IOException ioe) {
			System.out.println("파일로 출력할수 없습니다.");
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
