package example;

import java.awt.*;

import javax.swing.*;

public class TextPanel extends JFrame {
	public TextPanel() {
		//���1
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4, 3));
		for (int i = 0; i < 9; i++) {
			panel1.add(new JButton(i + ""));
		}
		panel1.add(new Button("0"));
		panel1.add(new Button("OK"));
		panel1.add(new Button("EXIT"));
		
		//���2
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(new JTextArea("��İְ��ڴˣ�����"),BorderLayout.NORTH);
		panel2.add(panel1,BorderLayout.CENTER);
		
		//����ײ���
		this.add(panel2,BorderLayout.EAST);
		this.add(new Button("���"), BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		TextPanel frame = new TextPanel();
		frame.setTitle("����");
		frame.setSize(400, 260);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.pack();
		frame.setVisible(true);
	}

}
