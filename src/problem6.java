/*
    @a - entered number
    @n - power of a
    @res - result of calculating
    @findPowofNum - function
    @return -calculates a to the power of n
*/
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();//enter the value for num
        int n =sc.nextInt();//enter the value for power
        int res = findPowofNum(a, n);//result
        System.out.println(a + " "+"to pow of"+" "+n+" "+"is"+" "+ res +".");
    }
    public static int findPowofNum(int a, int n) {
        if (n==1){
            return a;// return the value of a if the n equals to 1
        }
        else{
            return a*findPowofNum(a, n-1);//otherwise call the findPowofNum with n-1 as the argument and multiple a to find the a to th power of n
        }

    }
}