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
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
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
			System.out.println("������ ã���� �����ϴ�.");
		}
		catch(EOFException eofe) {
			System.out.println("��");
		}
		catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("Ŭ������ ã�� �� �����ϴ�.");
		}
		finally {
			try {
				in.close();
			}catch(Exception e) {
			}
		}
	}//main
}
