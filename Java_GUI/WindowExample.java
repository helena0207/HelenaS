import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Java Program");
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Hello, Java");
		contentPane.add(label);
		frame.pack();
		frame.setVisible(true);

	}

}
