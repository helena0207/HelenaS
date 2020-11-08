package object1104;

public class DVDplayer {
	boolean canRecord=false;
	
	void playDVD(){
		System.out.println("DVD player");
	}
	void recordDVD(){
		System.out.println("DVD recording");
	}

}
class DVDplayerTest{
	public static void main(String[] args) {
		DVDplayer d=new DVDplayer();
		
		d.canRecord=true;
		d.playDVD();
		
		if(d.canRecord==true){
			d.recordDVD();
		}

	}

}
