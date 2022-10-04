package java_practice;

import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String 철수,영희;
		
		System.out.print("철수 : ");
		철수 = s.next();
		System.out.print("영희 : ");
		영희 = s.next();
		
		if(철수.equals(영희))
				System.out.println("둘이 비겼습니다.");
		
		else if(철수.equals("가위")) {
			if(영희.equals("바위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("영희가 졌습니다.");
		}
		else if(철수.equals("바위")) {
			if(영희.equals("보"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("영희가 졌습니다.");
		}
		else if(철수.equals("보")) {
			if(영희.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("영희가 졌습니다.");
		}
		s.close();
	}

}
