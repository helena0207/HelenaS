package dynamic_beat_2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread {//怨� �옱�깮�븯�뒗 Thread

	private Player player;
	private boolean isLoop; //臾댄븳 諛섎났�씤吏� , �븳踰덈쭔 �옱�깮�븷寃껋씤吏�.
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
	public int getTime() {//�쁽�옱 �떎�뻾�릺怨� �엳�뒗 �쓬�븙�씠 �뼱�뵒源뚯� �떎�뻾�릺怨� �엳�뒗吏� �븣�닔 �엳�뒾.
		if(player == null)
			return 0;
		return player.getPosition();
	}
	public void close() {//�쓬�븙�쓣 �빆�긽 醫낅즺 �떆�궗�닔 �엳�뒾.
		isLoop=false;
		player.close();
		this.interrupt();//�뒪�젅�뱶瑜� 以묒� �긽�깭濡� 留뚮뱾�닔 �엳�뒾.
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
