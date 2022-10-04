package test;

import javax.swing.*;
import java.awt.*;

public class Button extends JFrame {
	
	public Button() {
		setTitle("10Buttons");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,10);
		grid.setVgap(5);
		setLayout(grid);
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("10"));
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Button();
	}

}
