/*
    @n - entered value of n
    @k - entered value of k
    @total - store the result
    @return - return 1 if n equals to k or k equals to 0
    @calculateBinomCoeff - function that calculate the binomial coefficent
*/import java.util.Scanner;
public class problem9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//entered variable for  values of C(n, k)
        int k = sc.nextInt();//entered variable for values of C(n, k)
        int total = calculateBinomCoeff(n, k);//calculate the result with using fuction calculateBinomCoeff
        System.out.println("Binomial coefficent of " +  n + " and " + k + " is " + total +".");//print the result
    }
    public static int calculateBinomCoeff(int n , int k){
        //base case
        if(k==0){
            return 1;//returns 1 if value of k equals to 0
        }
        else if(n==k){
            return 1;//returns 1 if values of n and k is equal
        }//recursive case
        return calculateBinomCoeff(n-1, k-1)*(n-k+1)/k;//calculate the C(n-1, k-1) and multiple it to (n-k+1)/k
    }
}
