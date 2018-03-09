package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class ShowButton extends JFrame {
	public ShowButton() {
		JButton button = new JButton("����");
		this.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ť�����");
				Object source = e.getSource();
				JButton button = (JButton) source;
				String text = button.getText();
				if ("��ť�����".equals(text)) {
					button.setText("����");
				} else {
					button.setText("��ť�����");
				}

			}
		});
	}

	public static void main(String[] args) {
		ShowButton frame = new ShowButton();
		frame.setTitle("�¼�����");
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
	}

}
