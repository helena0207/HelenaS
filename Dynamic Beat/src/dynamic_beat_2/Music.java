package dynamic_beat_2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {//곡 재생하는 Thread

	private Player player;
	private boolean isLoop; //무한 반복인지 , 한번만 재생할것인지.
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop=isLoop;
			file= new File(Main.class.getResource("../music/" + name).toURI());
			fis= new FileInputStream(file);
			bis= new BufferedInputStream(fis);
			player=new Player(bis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getTime() {//현재 실행되고 있는 음악이 어디까지 실행되고 있는지 알수 있슴.
		if(player == null)
			return 0;
		return player.getPosition();
	}
	public void close() {//음악을 항상 종료 시킬수 있슴.
		isLoop=false;
		player.close();
		this.interrupt();//스레드를 중지 상태로 만들수 있슴.
	}
	
	@Override
		public void run() {
			try {
				do {
					player.play();
					fis= new FileInputStream(file);
					bis= new BufferedInputStream(fis);
					player=new Player(bis);
				}while(isLoop);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	
}
