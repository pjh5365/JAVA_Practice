package java_practice;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class HangMan {
	public static void main(String[] args) {
		Vector<String> wordVector = new Vector<String>();
		Scanner input = new Scanner(System.in);
		
		try {
			Scanner s = new Scanner(new FileReader("words.txt"));
			
			while(s.hasNext()) {
				String word = s.nextLine();
				wordVector.add(word);
			}
		} catch(IOException e) {
			System.out.println("파일을 불러오지 못했습니다.");
		}
		
		System.out.println("지금부터 행맨게임을 시작합니다.");
		int wordChoice = ((int)(Math.random()*1000)) % wordVector.size();	//벡터의 크기로 나눠 랜덤뽑기
		char question[] = wordVector.get(wordChoice).toCharArray();
		System.out.println(question);
		
		int qnum = ((int)(Math.random()*1000)) % question.length;	//알파벳을 가릴 자리 결
		
		System.out.println(qnum);
		
		for(int i = 0; i < question.length; i++) {
			if(i == qnum) 
				System.out.print("-");
			else
				System.out.print(question[i]);
		}
		System.out.print("\n>>");
		
		String in = input.next();	//스캐너로 입력받기 위해 String사용
		char answer = in.charAt(0);	//입력받은 스트링중 첫번째 인덱스를 넘겨
		System.out.println(answer);
		if(answer == question[qnum])	//입력받은 값과 가려진 값이 같다면 실
			System.out.println("성공");
		else
			System.out.println("실패");
		
		input.close();
	}
}
