package com.huarongddao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ActionDeal implements ActionListener {
	private HuaMain hua;
	private JFrame frame;
	
	public ActionDeal(HuaMain hua,JFrame frame) {
		this.hua = hua;
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setVisible(false);
		hua.dispose(); // ×¢Ïú
		HuaMain frame = new HuaMain();
		hua.init(frame);
	}
}
