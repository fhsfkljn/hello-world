package com.huarongddao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Win extends JButton {
	public Win() {
	}

	public void winnerWindow(JFrame frame, HuaMain huaMain) {
		frame.setLayout(null);
		frame.setSize(300, 200);
		frame.setTitle("��ϲ��");
		JLabel winner = new JLabel("��ѡ���Ƿ��¿�һ�֣�");
		winner.setFont(new Font("����", Font.BOLD, 16));
		JButton again = new JButton("��");
		JButton quit = new JButton("��");
		again.addActionListener(new ActionDeal(huaMain,frame));
		quit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.add(again);
		frame.add(quit);
		frame.add(winner);
		again.setBounds(50, 100, 50, 50);
		quit.setBounds(200, 100, 50, 50);
		winner.setBounds(60, 20, 200, 50);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	public void startWindow(JFrame frame, HuaMain huaMain) {
		frame.setLayout(null);
		frame.setTitle("���ݵ�");
		frame.setSize(410, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JButton startGame = new JButton("��ʼ��Ϸ");
		JButton quitGame = new JButton("�˳���Ϸ");
		startGame.addActionListener(new ActionDeal(huaMain,frame));
		quitGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(startGame);
		frame.add(quitGame);
		startGame.setBounds(150,200,110,50);
		quitGame.setBounds(150,400,110,50);
	}
}
