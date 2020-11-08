package condingTest102902;
import java.sql.Date;

public class Buy {
	String buyNum;
	String buyID;
	String buyDate;
	String buyName;
	String productNum;
	String address;
	
	void showBuyInfo(){
		System.out.print("주문번호:" + buyNum+"\n"
	+"주문아이디:"+ buyID+"\n");
	}
}
