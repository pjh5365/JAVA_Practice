package test;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class DragMouse extends JFrame{
	
	public DragMouse () {
		setTitle("마우스 드래그");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
		
		Container c = getContentPane();
		c.setBackground(Color.GREEN);
		c.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				c.setBackground(Color.YELLOW);
			}
			
		});
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				c.setBackground(Color.GREEN);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
	}
	public static void main(String[] args) {
		new DragMouse();
	}
}
