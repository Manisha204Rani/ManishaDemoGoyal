import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i< 5;i++){
			System.out.println("Enter number");
			int no1 = scanner.nextInt();
			System.out.println(" User entered " + no1);
			//sum = sum + no1;
			sum += no1;
		}
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + sum/5);
		scanner.close();
			
		
	}

}
