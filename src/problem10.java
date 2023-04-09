/*
    @a - entered integer as parameters for GCD
    @b - entered integer as parametrs for GCD
    @res - result of calculating GCD
    @calculateGcd - calculate the GCD of two integers
    @return - return value of a if b equals to 0
*/
import java.util.Scanner;
public class problem10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//entered value for a
        int b = sc.nextInt();//entered value for b
        int res = calculateGcd(a, b);//calculate the result with using function calculateGcd
        System.out.println("GCD of numbers of " + a + " and " + b + " is " + res);
    }
    public static int calculateGcd(int a, int b){
        //base case
        if(b==0){
            return a;//return a if value of b equals to 0
        }
        else{
            return calculateGcd(b, a%b);//return the value of calculating GCD of two integers
        }
    }
}