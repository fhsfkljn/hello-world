package com.huarongddao;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
	private HuaMain hua;
	
	public MyMouseAdapter(HuaMain hua) {
		this.hua = hua;
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		Person man = (Person) e.getSource();
		int x = -1, y = -1;
		x = e.getX();
		y = e.getY();
		int w = man.getBounds().width;
		int h = man.getBounds().height;
		if (y > h / 2)
			hua.go(man, hua.below);
		if (y < h / 2)
			hua.go(man, hua.above);
		if (x < w / 2)
			hua.go(man, hua.left);
		if (x > w / 2)
			hua.go(man, hua.right);
	}
	
}
