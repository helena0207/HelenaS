import java.awt.*;

import javax.swing.*;

public class WindowExample04 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Contact Program");
		frame.setPreferredSize(new Dimension(250,150));
		frame.setLocation(500,400);
		Container contentPane=frame.getContentPane();
		
		JPanel panel=new JPanel(); //1.�г��� ����
		panel.setLayout(new GridLayout(3,2));//2.�г��� ���̾ƿ��� ����
		JTextField text1=new JTextField();//3.������Ʈ�� �����ؼ� �гο� �߰�
		JTextField text2=new JTextField();
		JTextField text3=new JTextField();
		panel.add(new JLabel("�̸�"));
		panel.add(text1);
		panel.add(new JLabel("�ּ�"));
		panel.add(text2);
		panel.add(new JLabel("��ȭ��ȣ"));
		panel.add(text3);
		contentPane.add(panel, BorderLayout.CENTER);//4.�г��� content pane�� �߰�
		
		contentPane.add(new Button("�Է�"), BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
