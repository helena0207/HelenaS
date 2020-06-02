import java.io.*;
import java.util.*;

public class ObjectOutputExample {

	public static void main(String[] args) {
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("output.dat"));
			out.writeObject(new GregorianCalendar(2006,0,14));
			out.writeObject(new GregorianCalendar(2006,0,15));
			out.writeObject(new GregorianCalendar(2006,0,16));
			
		}catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
		finally {
			try {
				out.close();
			}
			catch(Exception e) {
			}
		}
		
		ObjectInputStream in=null;
		try {
			int year, month, date;
			in=new ObjectInputStream(new FileInputStream("output.dat"));
			while(true) {
				GregorianCalendar calendar=(GregorianCalendar) in.readObject();
				year= calendar.get(Calendar.YEAR);
				month=calendar.get(Calendar.MONTH);
				date=calendar.get(Calendar.DATE);
				System.out.println(year+"/"+month+"/"+date);
			}
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("파일을 찾을수 없습니다.");
		}
		catch(EOFException eofe) {
			System.out.println("끝");
		}
		catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		finally {
			try {
				in.close();
			}catch(Exception e) {
			}
		}
	}//main
}
