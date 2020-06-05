import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowExampl02 {

	public static void main(String[] args) {
/*
		JFrame frame =new JFrame("Hello Java Program"); //타이틀바 표시 문자 포함
	frame.setLocation(500,400);  //생성 위치
	frame.setPreferredSize(new Dimension(300,200)); //파라미터값 Dimension 타입 값으로
	Container contentPane = frame.getContentPane();
	JLabel label = new JLabel("헬로 자바", SwingConstants.CENTER);
	contentPane.add(label);
	
	//닫기버튼이 클릭되었을 경우 할일 , 윈도우 창닫기, 프로그램 종료
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//윈도우창 디스플레이
	frame.pack();
	frame.setVisible(true);
*/
/*
	JFrame frame =new JFrame("Hello Java Promgram");
	frame.setLocation(500,400);
	frame.setPreferredSize(new Dimension(200,100));
	
	Container contentPane=frame.getContentPane();
	JTextField text=new JTextField();
	JButton button = new JButton("확인");
	JLabel label = new JLabel("Hello");
	
	contentPane.add(text,BorderLayout.CENTER);
	contentPane.add(button,BorderLayout.EAST);
	contentPane.add(label,BorderLayout.SOUTH);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
*/
	JFrame frame = new JFrame("Hello Program");
	frame.setLocation(500,400);
	frame.setPreferredSize(new Dimension(200,70));
	Container contentPane = frame.getContentPane();
	
	JTextField text=new JTextField();
	JButton button = new JButton("확인");
	JLabel label =new JLabel("Hello");
	
	contentPane.add(text, BorderLayout.CENTER);
	contentPane.add(button, BorderLayout.EAST);
	contentPane.add(label, BorderLayout.SOUTH);
	
	ActionListener listener = new ConfirmButtonActionListener(text,label);
	button.addActionListener(listener);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	}
}

class ConfirmButtonActionListener implements ActionListener{
	JTextField text;
	JLabel label;
	ConfirmButtonActionListener(JTextField text, JLabel label){
		this.text = text;
		this.label =label;
	}
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		label.setText("hell, " + name);
	}
}
