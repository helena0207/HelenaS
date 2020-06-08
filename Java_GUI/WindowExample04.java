import java.awt.*;

import javax.swing.*;

public class WindowExample04 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Contact Program");
		frame.setPreferredSize(new Dimension(250,150));
		frame.setLocation(500,400);
		Container contentPane=frame.getContentPane();
		
		JPanel panel=new JPanel(); //1.패널을 생성
		panel.setLayout(new GridLayout(3,2));//2.패널의 레이아웃을 설정
		JTextField text1=new JTextField();//3.컴포넌트를 생성해서 패널에 추가
		JTextField text2=new JTextField();
		JTextField text3=new JTextField();
		panel.add(new JLabel("이름"));
		panel.add(text1);
		panel.add(new JLabel("주소"));
		panel.add(text2);
		panel.add(new JLabel("전화번호"));
		panel.add(text3);
		contentPane.add(panel, BorderLayout.CENTER);//4.패널을 content pane에 추가
		
		contentPane.add(new Button("입력"), BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
