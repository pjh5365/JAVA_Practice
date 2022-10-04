package test;

public class Gugudan {

	public static void main(String[] args) {

		try {
			int a = 5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("에러");
			System.out.println(e);
		}
		finally {
			System.out.println("무조건 출력");
		}
	}
}
