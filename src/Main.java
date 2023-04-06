import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorialofn(n);
        System.out.println(n +"!"+ "=" + result);
    }

    public static int factorialofn(int n) {
        if (n == 0){
            return 1;
        }
        else {
            return n*factorialofn(n-1);
        }
    }
}