

public class Main {

	public static void main(String[] args) {
	
			GoodsStock obj;
			
			obj=new GoodsStock("12345",-50);
						
			System.out.println("상품코드 : " + obj.goodsCode);
			System.out.println("재고량 : " + obj.stockNum);
			
			obj.addStock(1000);
			
			System.out.println("상품코드 : " + obj.goodsCode);
			System.out.println("재고량 : " + obj.stockNum);
		
	}

}
