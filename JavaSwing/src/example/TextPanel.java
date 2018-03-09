package example;

import java.awt.*;

import javax.swing.*;

public class TextPanel extends JFrame {
	public TextPanel() {
		//面板1
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 3));
		for (int i = 0; i < 9; i++) {
			panel1.add(new JButton(i + ""));
		}
		panel1.add(new Button("0"));
		panel1.add(new Button("OK"));
		panel1.add(new Button("EXIT"));
		
		//面板2
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(new JTextArea("你的爸爸在此！！！"),BorderLayout.NORTH);
		panel2.add(panel1,BorderLayout.CENTER);
		
		//加入底层框架
		this.add(panel2,BorderLayout.EAST);
		this.add(new Button("你好"), BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		TextPanel frame = new TextPanel();
		frame.setTitle("测试");
		frame.setSize(400, 260);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.pack();
		frame.setVisible(true);
	}

}
