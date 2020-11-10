package inheritance;

public class CalculatorDemo {
	public static void execute(Calculator cal){
		System.out.println("실행결과");
		cal.run();
	}

	public static void main(String[] args) {
		Calculator c1=new CalculatorDecoPlus();
		c1.setOprands(10,20);
		//c1.run();
		execute(c1);
		
		Calculator c2= new CalculatorDecoMinus();
		c2.setOprands(10,20);
		//c2.run();
		execute(c2);
		
	}

}
