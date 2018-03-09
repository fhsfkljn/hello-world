package com.huarongddao;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyAdapter extends KeyAdapter {
	private HuaMain hua;
	
	public MyKeyAdapter(HuaMain hua) {
		this.hua = hua;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		Person man = (Person) e.getSource();
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			hua.go(man, hua.below);
		if (e.getKeyCode() == KeyEvent.VK_UP)
			hua.go(man, hua.above);
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			hua.go(man, hua.left);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			hua.go(man, hua.right);

	}
}
