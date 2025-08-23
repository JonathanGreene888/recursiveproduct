package productrecursionsolution;

import java.util.Scanner;

public class ProductRecursionSolution {
	
    
    public static int solveProduct(int[] array, int index) {
        // my base case
    	if (index < 0) {
            return 1;
        } else {
            return (int) array[index] * solveProduct(array, index - 1);
        }
    }

	public static void main(String[] args) {
	     
	     Scanner scanner = new Scanner(System.in);
	        int[] inputs = new int[5];
	        
	        
	        System.out.println("Enter numbers:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Please Enter number: ");
	            inputs[i] = scanner.nextInt();
	        }
	        
	        int result = solveProduct(inputs, inputs.length - 1);
	       System.out.println("Product is: " + result);
	       
	       scanner.close();

	}

}
