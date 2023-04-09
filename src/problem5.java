/*
    @n - index of element in Fibonacci sequences
    @Fibonacci - method with n as arguments, prints the result to console
    @result - store the result
*/
import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = Fibonacci(n);//call the Fibonacci with n and store the result in variable result
        System.out.println("Fibonacci of number" + " " + n + " = " + result + ".");//print the values of n
    }
    public static int Fibonacci(int n) {
        if (n == 0){
            return 0;//return 0 if value of n equals to 0
        }
        else if(n == 1){
            return 1;//return 1 if value of n equals to 1
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);//calculates the sum of previous two elements
        }
    }
}

