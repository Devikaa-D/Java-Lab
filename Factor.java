import java.util.Scanner;
 
public class Factor {
 
   public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	int number = scanner.nextInt();
	scanner.close();
	System.out.println("Factors of " + number + " are:");
	for (int loopCounter = 1; loopCounter <= number; loopCounter++){
		if (number % loopCounter == 0) {
			System.out.print(loopCounter + " ");
		}
	}
   }
}

OUTPUT

Enter a number
44
Factors of 44 are:
1 2 4 11 22 44