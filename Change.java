import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the value of C: ");
        int C = scanner.nextInt();
        
        System.out.print("Enter the value of D: ");
        int D = scanner.nextInt();
        
        C = C + D;  
        D = C - D; 
        C = C - D;  
        
        System.out.println("After interchanging:");
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        
        scanner.close();
    }
}
