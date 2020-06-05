import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class WindowExampl02 {

	public static void main(String[] args) {
/*
		JFrame frame =new JFrame("Hello Java Program"); //Ÿ��Ʋ�� ǥ�� ���� ����
	frame.setLocation(500,400);  //���� ��ġ
	frame.setPreferredSize(new Dimension(300,200)); //�Ķ���Ͱ� Dimension Ÿ�� ������
	Container contentPane = frame.getContentPane();
	JLabel label = new JLabel("��� �ڹ�", SwingConstants.CENTER);
	contentPane.add(label);
	
	//�ݱ��ư�� Ŭ���Ǿ��� ��� ���� , ������ â�ݱ�, ���α׷� ����
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//������â ���÷���
	frame.pack();
	frame.setVisible(true);
*/
/*
	JFrame frame =new JFrame("Hello Java Promgram");
	frame.setLocation(500,400);
	frame.setPreferredSize(new Dimension(200,100));
	
	Container contentPane=frame.getContentPane();
	JTextField text=new JTextField();
	JButton button = new JButton("Ȯ��");
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
	JButton button = new JButton("Ȯ��");
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
