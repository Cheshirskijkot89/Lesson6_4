package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		int number;
		
		System.out.println("¬ведите искомое число:");
		number = sc.nextInt();
		sc.close();
		
		System.out.println(findMax(myArray, number));
	}
	
static int findMax(int[] pArr, int pNumber) {
		
		int result = -1;
	
		for(int counter: pArr) {
		
			if (counter == pNumber) {
				result = counter;
			} 
			
		}
		
	return 	result;
		
	}

}
