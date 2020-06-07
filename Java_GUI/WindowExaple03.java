import java.awt.*;
import javax.swing.*;

public class WindowExaple03 {
	public static void main(String args[]) {
/*
		//grid layout :영역을 같은 사이즈로 나누어 배열
		JFrame frame=new JFrame("zoo Program");
		frame.setLocation(500,400);
		Container contentPane=frame.getContentPane();
		
		GridLayout layout =new GridLayout(3,2);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("얼룩말"));
		contentPane.add(new JButton("사자"));
		contentPane.add(new JButton("코끼리"));
		contentPane.add(new JButton("코뿔소"));
		contentPane.add(new JButton("펭귄"));
		//contentPane.add(new JButton("하이에나"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		//flow layout: 왼쪽에서 오른쪽으로 컴포넌트를 배열하다가 폭이 모자라면 줄을 바꿔서 계속 배열한다.
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		
		FlowLayout layout=new FlowLayout();
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("사과"));
		contentPane.add(new JButton("파인애플"));
		contentPane.add(new JButton("오렌지"));
		contentPane.add(new JButton("포도"));
		contentPane.add(new JButton("레몬"));
		contentPane.add(new JButton("복숭아"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
*/
		//box layout : 컴포넌트를 가로 또는 세로로 순서대로 배열하는 레이아웃
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(500,200);
		Container contentPane=frame.getContentPane();
		
		BoxLayout layout=new BoxLayout(contentPane,BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("아메리카노"));
		contentPane.add(new JButton("에스프레소"));
		contentPane.add(new JButton("카푸치노"));
		contentPane.add(new JButton("블루마운틴"));
		contentPane.add(new JButton("콜럼비아"));
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}//main
}
//flow layout을 사용하는 프로그램
