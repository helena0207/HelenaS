
public class InterfaceExample {

	public static void main(String[] args) {
		Lendable arr[]=new Lendable[3];
		arr[0]=new SeparateVolume("883o326ㅍ2","푸코의 진자","에코");
		arr[1]=new SeparateVolume("609ㅁ428ㄷ","서양의미술사","곰브리치");
		arr[2]=new AppCDInfo("2002-1742","XML을 위한 자바 프로그래밍");
		checkOutAll(arr,"윤지혜","20063015");
		//배열을 파라미터로 넘겨줍니다.
	}
	static void checkOutAll(Lendable arr[], String borrower, String date) {
		for(int cnt=0; cnt<arr.length; cnt++) {
			arr[cnt].checkOut(borrower, date);//배열의 모든 항목에 대해 checkOut메소드 호출
		}
	}
}
