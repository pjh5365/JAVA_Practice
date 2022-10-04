package test;

import java.util.Scanner;

public class Dollar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		double input = s.nextDouble();
		
		System.out.println(input/1100 + "$");
		
		s.close();
	}

}
