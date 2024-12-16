import java.util.Scanner;

public class CheckingValidPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type your number here:");
        int input = sc.nextInt();
        sc.nextLine();

        boolean isValid = compare(input);

        System.out.println(isValid);
    }

    public static boolean compare(int input) {
        if (input <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
