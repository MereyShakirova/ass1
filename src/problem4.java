/*
    @findFactorial - function
    @n - entered number
    @res - result of factorial of value
    @return - returning the factorial of entered number(n)
*/
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//entered variable
        int res = findFactorial(n);
        System.out.println(n + "!" + "=" + res);//print the result
    }
    public static int findFactorial(int n){
        if(n == 0){
            return 1;//return 1 if value of n equals to 0
        }
        else{
            return n * findFactorial(n-1);//call the factorial with n-1 as the argument and multiple n
        }
    }
}

