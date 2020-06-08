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
		TableModel model= table.getModel();//모델을 가져옴
		int rowNum=model.getRowCount();//모델로부터 행과 열의 수를 가져옴.
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
		
		String colName[]= {"이름","나이","성별"};
		Object data[][]= {{"개똥이",24,'남'},
				{"소똥이",21,'여'},
				{"말똥이",26,'여'}};
		JTable table=new JTable(data, colName);
		JScrollPane scrollPane=new JScrollPane(table);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		JButton button=new JButton("출력");
		button.addActionListener(new PrintActionListener(table));
		contentPane.add(button, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}//main
}
