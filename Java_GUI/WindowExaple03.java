import java.awt.*;
import javax.swing.*;

public class WindowExaple03 {
	public static void main(String args[]) {
/*
		//grid layout :������ ���� ������� ������ �迭
		JFrame frame=new JFrame("zoo Program");
		frame.setLocation(500,400);
		Container contentPane=frame.getContentPane();
		
		GridLayout layout =new GridLayout(3,2);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("��踻"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("�ڳ���"));
		contentPane.add(new JButton("�ڻԼ�"));
		contentPane.add(new JButton("���"));
		//contentPane.add(new JButton("���̿���"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		//flow layout: ���ʿ��� ���������� ������Ʈ�� �迭�ϴٰ� ���� ���ڶ�� ���� �ٲ㼭 ��� �迭�Ѵ�.
		JFrame frame = new JFrame("Fruit Basket Program");
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		
		FlowLayout layout=new FlowLayout();
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("���ξ���"));
		contentPane.add(new JButton("������"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("������"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
*/
		//box layout : ������Ʈ�� ���� �Ǵ� ���η� ������� �迭�ϴ� ���̾ƿ�
		JFrame frame = new JFrame("Cafe Program");
		frame.setLocation(500,200);
		Container contentPane=frame.getContentPane();
		
		BoxLayout layout=new BoxLayout(contentPane,BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		
		contentPane.add(new JButton("�Ƹ޸�ī��"));
		contentPane.add(new JButton("����������"));
		contentPane.add(new JButton("īǪġ��"));
		contentPane.add(new JButton("��縶��ƾ"));
		contentPane.add(new JButton("�ݷ����"));
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}//main
}
//flow layout�� ����ϴ� ���α׷�
