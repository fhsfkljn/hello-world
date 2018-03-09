package example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class ShowButton extends JFrame {
	public ShowButton() {
		JButton button = new JButton("点我");
		this.add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("按钮被点击");
				Object source = e.getSource();
				JButton button = (JButton) source;
				String text = button.getText();
				if ("按钮被点击".equals(text)) {
					button.setText("点我");
				} else {
					button.setText("按钮被点击");
				}

			}
		});
	}

	public static void main(String[] args) {
		ShowButton frame = new ShowButton();
		frame.setTitle("事件处理");
		frame.setSize(400,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.pack();
		frame.setVisible(true);
	}

}
