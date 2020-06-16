package dynamic_beat_2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	public DynamicBeat() {
		setTitle("Dynamic Beat"); 
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 창의 크기 지정
		setResizable(false); //창의 크기 임의적 조정 불가능하게
		setLocationRelativeTo(null); //화면의 정중앙에 뜨게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창의 종료했을때 프로그램 종료 됨.
		setVisible(true);
	
		introBackground=new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	}
	public void paint(Graphics g) {
		screenImage=createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic=screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage,0,0,null);
	}
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0,0,null);
		this.repaint();
	}
}
