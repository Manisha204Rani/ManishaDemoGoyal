import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		int no1 = scanner.nextInt();
		
		if ((no1 % 2) == 0) {
			System.out.println( no1 + " is Even ");
		} else {
			System.out.println(no1 + " is Odd");
		}
		scanner.close();
	}

}
