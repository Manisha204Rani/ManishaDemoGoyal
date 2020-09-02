import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5]; 
		for (int i = 0; i< 5;i++){
			System.out.println("Enter number");
			arr[i]= scanner.nextInt();
			System.out.println(" User entered " + arr[i]);
		}
		scanner.close();
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i< arr.length;i++){
			
			System.out.println(  "[" + i + "] =" + arr[i]);
		}
		
	}

}
