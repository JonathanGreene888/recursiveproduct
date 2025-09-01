package productrecursionsolution;

import java.util.Scanner;

public class ProductRecursionSolution {
	
    /** Recursive function that find the answer to a multiplication problem*/
    public static int solveProduct(int[] array, int index) {
        // my base case
    	if (index < 0) {
            return 1;
        } else {
            return (int) array[index] * solveProduct(array, index - 1);
        }
    }

	public static void main(String[] args) {
	     
	        int[] inputs = new int[5];
	        
	        try (Scanner scanner = new Scanner(System.in)) {
		        System.out.println("Enter numbers:");
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Please Enter number: ");
		            if(scanner.hasNextInt()) {
		            	inputs[i] = scanner.nextInt();
		            } else {
		            	 System.out.println("Invalid input. That is not an integer.");
		            }
		        }
		        
		        int result = solveProduct(inputs, inputs.length - 1);
		        System.out.println("Product is: " + result);
	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }
	}

}
