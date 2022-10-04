package test;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Random extends JFrame{

	public Random() {
		setTitle("Random Label");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		int random = (int)(Math.random()*200) + 50;
		
		JLabel randomLabel = new JLabel("JLabel");
		randomLabel.setOpaque(true);
		randomLabel.setBackground(Color.blue);
		randomLabel.setLocation(random, random);
		randomLabel.setSize(50,50);
		add(randomLabel);
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Random();
	}

}
