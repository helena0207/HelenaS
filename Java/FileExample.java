import java.io.File;
import java.util.GregorianCalendar;

public class FileExample {

	public static void main(String[] args) {
		File file=new File("."); //현재 디렉토리 경로명을 가지고 File 객체를 생성합니다.
		File arr[]=file.listFiles();
		
		for(int cnt=0; cnt <arr.length ; cnt++) {
			String name = arr[cnt].getName();
			
			if(arr[cnt].isFile()) {
				System.out.printf("%-25s   %7d", name, arr[cnt].length());
			}else {
				System.out.printf("%-25s  <DIR>",name);
			}
			long time=arr[cnt].lastModified();
			GregorianCalendar calendar=new GregorianCalendar();
			calendar.setTimeInMillis(time);
			System.out.printf("%1$tF %1$tT %n", calendar);
		}

	}

}
