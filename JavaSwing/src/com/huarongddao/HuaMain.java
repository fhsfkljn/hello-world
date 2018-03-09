package com.huarongddao;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class HuaMain extends JFrame {
	private boolean flag = true;   //修复了胜利时弹出两个对话框的bug
	private Person[] person = new Person[10];
	public JButton left, right, above, below;
	private JButton restart = new JButton("重新开始");
	private String[] name = { "huangzhong", "caocao", "machao", "zhaoyun", "guanyu", "zhangfei", "zu", "zu", "zu",
			"zu" };

	public HuaMain() {
		setLayout(null);

		add(restart);
		restart.setBounds(150, 600, 100, 50);
		restart.addActionListener(new ActionDeal(this,new JFrame()));

		for (int i = 0; i < 10; i++) {
			person[i] = new Person(i, "" + i);
			person[i].setIcon(new ImageIcon("..\\JavaSwing\\image\\" + name[i] + ".jpg"));
			person[i].addMouseListener(new MyMouseAdapter(this));
			person[i].addKeyListener(new MyKeyAdapter(this));
			add(person[i]);
		}

		person[0].setBounds(5, 5, 100, 200);
		person[1].setBounds(105, 5, 200, 200);// 曹操
		person[2].setBounds(305, 5, 100, 200);
		person[3].setBounds(5, 205, 100, 200);
		person[4].setBounds(105, 205, 200, 100);
		person[5].setBounds(305, 205, 100, 200);
		person[6].setBounds(5, 405, 100, 100);
		person[7].setBounds(105, 305, 100, 100);
		person[8].setBounds(205, 305, 100, 100);
		person[9].setBounds(305, 405, 100, 100);
		left = new JButton();
		right = new JButton();
		above = new JButton();
		below = new JButton();
		add(left);
		add(right);
		add(above);
		add(below);
		left.setBounds(0, 0, 5, 510);
		right.setBounds(405, 0, 5, 510);
		above.setBounds(5, 0, 400, 5);
		below.setBounds(5, 505, 400, 5);

	}

	public void init(HuaMain frame) {
		flag = true;
		frame.setTitle("华容道");
		frame.setSize(410, 700);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.validate(); // 使用 validate 方法会使容器再次布置其子组件。确保布局有效
		// frame.pack();
	}

	public void go(Person man, JButton direction) {
		int finx = 105, finy = 305;
		boolean move = true;
		Rectangle manRect = man.getBounds();
		int x = man.getBounds().x;
		int y = man.getBounds().y;
		if (direction == below)
			y += 100;
		else if (direction == above)
			y -= 100;
		else if (direction == left)
			x -= 100;
		else if (direction == right)
			x += 100;
		manRect.setLocation(x, y);
		Rectangle directionRect = direction.getBounds();
		for (int k = 0; k < 10; k++) {
			Rectangle personRect = person[k].getBounds();
			if (manRect.intersects(personRect) && man.number != k)
				move = false;
		}
		if (manRect.intersects(directionRect))
			move = false;
		if (move == true)
			man.setLocation(x, y);
		if (person[1].getBounds().x == finx && person[1].getBounds().y == finy) {

			if(flag){
				flag = false;
				Win fr = new Win();
				fr.winnerWindow(new JFrame(), this);
			}
		}
	}

	public static void main(String[] args) {
		HuaMain hua = new HuaMain();
		Win win = new Win();
		JFrame frame = new JFrame();
		win.startWindow(frame, hua);
	}

}
