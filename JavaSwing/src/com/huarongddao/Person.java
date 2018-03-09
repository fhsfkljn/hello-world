package com.huarongddao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Person extends JButton implements MouseListener {
	public int number;
	private Color color = new Color(255, 245, 170);
	private Font font = new Font("ËÎÌו",Font.BOLD,12);
	
	public Person(int number,String name){
		super(name);
		this.number = number;
		setBackground(color);
		setFont(font);
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
