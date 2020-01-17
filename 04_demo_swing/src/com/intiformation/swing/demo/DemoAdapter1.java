package com.intiformation.swing.demo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DemoAdapter1 extends MouseAdapter{

	@Override
	public void mouseClicked(MouseEvent e) {
		e.getX();
		e.getY();
		
		
		super.mouseClicked(e);
	}

	

}
