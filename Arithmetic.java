import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int firstTerm = 0;
		    int numberOfTerms = 0;
		    int nthTerm = 0;
		    int commonDifference = 0;
		    int  sum= 0;
		    int term = 0;

		    System.out.print("Enter the value of a (First Term) : "); 
		    firstTerm = input.nextInt();

		    System.out.print("Enter the value of d (Common Difference) : "); 
		    commonDifference = input.nextInt();

		    System.out.print("Enter the value of n (Number of terms) : "); 
		    numberOfTerms = input.nextInt();

		    nthTerm = firstTerm + (numberOfTerms - 1) * commonDifference;

		    sum = numberOfTerms * (2 * firstTerm + (numberOfTerms - 1) * commonDifference)/2;

		    System.out.println("");
		    System.out.println("The Arithmetic Progression is as follows :");

		    for(int i = 0; i < numberOfTerms; i++){
		      term = firstTerm + i * commonDifference;
		      System.out.print(term+" + ");
		    }

		    System.out.println("...");
		    System.out.println("The nthTerm of the series : " + nthTerm);
		    System.out.println("The Sum of n terms of series : " + sum);


	}

}
