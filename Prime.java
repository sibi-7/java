import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num <= 1) {
            System.out.println(num + " is not a prime number."); 
        } else {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number.");
                    scanner.close();
                    return;
                }
            }
            System.out.println(num + " is a prime number.");
        }

        scanner.close();
    }
}
