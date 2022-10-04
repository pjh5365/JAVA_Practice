package java_practice;

import java.io.*;

public class TextTest {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("test.txt");
			InputStreamReader in = new InputStreamReader(fin, "utf-8");	//맥북은 ms949인코딩을 사용하지 않고 UTF8인코딩을 사용함.
			
			int c;
			
			System.out.println("인코딩 문자집합은 " + in.getEncoding());
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
