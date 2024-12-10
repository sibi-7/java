import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
               System.out.print("Enter a number: ");
        	int number = scanner.nextInt();
        
               int square = number * number;
       	       int cube = number * number * number;
        
                System.out.println("The square of " + number + " is: " + square);
        	System.out.println("The cube of " + number + " is: " + cube);
        
                scanner.close();
    }
}
