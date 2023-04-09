import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of problem");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1 -> {
                int[] arr = {10, 1, 32, 3, 45};
                int min = problem1.findMin(arr, arr.length);
                System.out.println("Min from  arr is:" + " " + min);
            }
            case 2 -> {
                int[] array = {3, 2, 4, 1};//entered set of values of array
                double result = problem2.findarravg(array, array.length);//result
                System.out.println("Average of this arr is " + result + ".");//print the result
            }
            case 3 -> {
                int num12 = 7;
                String result1 = String.valueOf(problem3.findPrimeOrComposite(num12 / 2));
                System.out.println("Number is" + result1);
            }
            case 4 -> {
                System.out.println("Enter n:");
                int n = sc.nextInt();//entered variable
                int res = problem4.findFactorial(n);
                System.out.println(n + "!" + "=" + res);//print the result
            }
            case 5 -> {
                System.out.println("Enter a5:");
                int a = sc.nextInt();
                int total = problem5.Fibonacci(a);//call the Fibonacci with n and store the result in variable result
                System.out.println("Fibonacci of number" + " " + a + " = " + total + ".");//print the values of n
            }
            case 6 -> {
                int number = 2;//enter the value for num
                int degree = 10;//enter the value for power
                int pow = problem6.findPowofNum(number, degree);//result
                System.out.println(number + " " + "to pow of" + " " + degree + " " + "is" + " " + pow + ".");
            }
            case 7 -> {
                String str = "123456";
                String str12 = String.valueOf(problem7.consistsOnlyDigits(str));
                System.out.println("Is string contains only digits? " + str12);
            }
            case 8 -> {
                int[] arr1 = {1, 4, 6, 2};
                problem8.reversedArr(arr1, 0, arr1.length - 1);
            }
            case 9 -> {
                int x = 7;
                int y = 3;
                int res1 = problem9.calculateBinomCoeff(x, y);//calculate the result with using fuction calculateBinomCoeff
                System.out.println("Binomial coefficent of " + x + " and " + y + " is " + res1 + ".");//print the result
            }
            case 10 -> {
                int q = 32;
                int w = 48;
                int totally = problem10.calculateGcd(q, w);//calculate the result with using function calculateGcd
                System.out.println("GCD of numbers of " + q + " and " + w + " is " + totally);
            }
            default -> System.out.println("Wrong input!");
        }

    }
}