/*
    @n - entered number
    @return - returns true or false
    @findPrimeOrComposite - checks the number is prime or composite
*/
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//entered number

        if (findPrimeOrComposite(n)) {
            System.out.println("Prime");//if number is prime print prime
        } else {
            System.out.println("Composite");//if number is composite prints composite
        }
    }

    public static boolean findPrimeOrComposite(int n) {
        if (n <= 1) {
            return false;//if num less or equals to 1, return fasle
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                return false;//return false if n % i == 0


            }
        }

        return true;//otherwise "if" statements are all false, then return true
    }
}

