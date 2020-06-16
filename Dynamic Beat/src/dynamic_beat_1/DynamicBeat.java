package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	public DynamicBeat() {
		setTitle("Dynamic Beat"); 
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);// 창의 크기 지정
		setResizable(false); //창의 크기 임의적 조정 불가능하게
		setLocationRelativeTo(null); //화면의 정중앙에 뜨게
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창의 종료했을때 프로그램 종료 됨.
		setVisible(true);
	}
}
