import java.io.*;
import java.net.Socket;

public class ClientExample01 {

	public static void main(String[] args) {
		Socket socket=null;
		try {
			socket=new Socket("192.168.0.14",9000);// 소켓을 생성
			InputStream in=socket.getInputStream();
			OutputStream out=socket.getOutputStream();
			String str="Hello Sever";
			out.write(str.getBytes());//데이터를 송신합니다.
			
			byte arr[]=new byte[100];
			in.read(arr);
			System.out.println(new String(arr));//수신된 데이터를 출력합니다.
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				socket.close();
			}catch(Exception e) {
			}
		}
	}

}
