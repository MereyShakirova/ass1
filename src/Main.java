import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int atoPowerOfn = power(a, n);
        System.out.println(a + " " + "to the power of" + " " + n + " " + "is" + " " + atoPowerOfn + ".");
    }

    public static int power(int a, int n) {
        if (n == 1){
            return a;
        }
        else {
            return a*power(a, n-1);
        }
    }
}