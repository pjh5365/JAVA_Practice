package test;

public class star {

	public static void main(String[] args) {
		for (int a = 0; a < 5; a++) 
		{
			for (int b=a; b <= 5-1; b++) {
				System.out.printf(" ");
			}
			for (int c = 0; c <=(a*2); c++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
