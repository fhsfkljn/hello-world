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
		frame.setTitle("恭喜你");
		JLabel winner = new JLabel("请选择是否新开一局？");
		winner.setFont(new Font("宋体", Font.BOLD, 16));
		JButton again = new JButton("是");
		JButton quit = new JButton("否");
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
		frame.setTitle("华容道");
		frame.setSize(410, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JButton startGame = new JButton("开始游戏");
		JButton quitGame = new JButton("退出游戏");
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
