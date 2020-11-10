package inheritance;

public abstract class Calculator {
	int left, right;
	public void setOprands(int left, int right){
		this.left=left;
		this.right=right;
	}
	int _sum(){
		return this.left+this.right;
	}
	public abstract void sum();//추상메소드
	public abstract void avg();
	public void run(){
		sum();
	}
}
