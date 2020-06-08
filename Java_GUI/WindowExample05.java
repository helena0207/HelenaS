import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.*;
import javax.swing.*;
import javax.swing.table.TableModel;

class PrintActionListener implements ActionListener{
	JTable table;
	PrintActionListener(JTable table){
		this.table=table;
	}
	public void actionPerformed(ActionEvent e) {
		TableModel model= table.getModel();//���� ������
		int rowNum=model.getRowCount();//�𵨷κ��� ��� ���� ���� ������.
		int colNum=model.getColumnCount();
		
		for(int col=0;col<colNum; col++) {
			String colName=model.getColumnName(col);
			System.out.print(colName  +"\t");
		}
		System.out.println();
		for(int row=0; row<rowNum;row++) {
			for(int col=0;col<colNum;col++) {
				Object obj=model.getValueAt(row, col);
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
	}
}

public class WindowExample05 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Participant List Program");
		frame.setPreferredSize(new Dimension(300,150));
		frame.setLocation(500,400);
		Container contentPane=frame.getContentPane();
		
		String colName[]= {"�̸�","����","����"};
		Object data[][]= {{"������",24,'��'},
				{"�Ҷ���",21,'��'},
				{"������",26,'��'}};
		JTable table=new JTable(data, colName);
		JScrollPane scrollPane=new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button=new JButton("���");
		button.addActionListener(new PrintActionListener(table));
		contentPane.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}//main
}
