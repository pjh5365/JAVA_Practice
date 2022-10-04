package test;

import java.io.*;
import java.util.Scanner;

public class TextInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			FileWriter fout = new FileWriter("testInput.txt");
			
			while(true) {
				String line = s.nextLine();
				
				if(line.length() == 0)
					break;
				
				fout.write(line, 0, line.length());
				fout.write("\r\n");
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		s.close();
	}
}
