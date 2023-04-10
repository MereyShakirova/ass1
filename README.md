# Assignment1 work for ADS
## Description
In this reprository, I wrote codes for laboratory work for Algorithm data structure by using recursion and recursion.
## Problem 1

In this problem I have written a code to find the minimum value among the input array and for this I created findMin(int[] arr, int n) and used recursion.

### Definition:
    @findMin - function that finds the minimum value in an array
    @min - call the findMin to find the minimum value of array
    @return - returning the minimum value of function
    @arr - array

### Solution:
    public class problem1 {
        public static void main(String[] args){
            int[] arr = {10, 1, 32, 3, 45}; // enters the values in array
            int min = findMin(arr, arr.length);
            System.out.println("Min from  arr is:" + " " + min);
        }
        public static int findMin(int[] arr, int n){
            if(n==1)//base case
                return arr[0]; // return the element if the array have only one element
            else{ // recursive case
                int min = findMin(arr,  n-1); //get value of array in n-1
                return Math.min(min, arr[n-1]); // return the element of array in [n-1] index
            }
        }
}

## Problem 2

In this problem, it was necessary to find the average value of a given array, for this I entered the function findarravg.

### Definition:
    @arr - array
    @findarravg - method is a recursive method that calculates the average of an array of integers

### Solution:
    public class problem2 {
    public static void main(String[] args) {
            int[] arr = {3, 2, 4, 1};//entered set of values of array
            double result = findarravg(arr, arr.length);//result
            System.out.println("Average of this arr is " + result + ".");//print the result
            }
        public static double findarravg(int[] arr, int a) {
            if (a == 0) {
                return 0;//return 0 if the  array is empty
            }
            else {
                return (arr[a-1] + (a-1)*findarravg(arr, a-1)) / a;// return the average is calculated as the sum of the elements divided by the number of elements
            }
        }
    }

## Problem 3

In this problem, I used the functions and recursion method to check the number is prime or composite.

### Definition:
    @n - entered number
    @return - returns true or false
    @findPrimeOrComposite - checks the number is prime or composite

### Solution
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

## Problem 4

In this problem, it was necessary to find the factorial of the n-th value and display the answer for this, I introduced the function findFactorial.

### Definition:
    @findFactorial - function
    @n - entered number
    @res - result of factorial of value
    @return - returning the factorial of entered number(n)

### Solution:
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

## Problem 5

In this problem, it was necessary to find the Fibonacci number by entering a number and derive the answer using the formula using recursion and the introduced Fibonacci (n) function.

### Definition:
    @n - index of element in Fibonacci sequences
    @Fibonacci - method with n as arguments, prints the result to console
    @result - store the result

### Solution
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

## Problem 6

The problem is to find a to the power of n by writing a function that will return the value of a to the power of n by entering the value for a and n.

### Definition:
    @a - entered number
    @n - power of a
    @res - result of calculating
    @findPowofNum - function
    @return -calculates a to the power of n

### Solution:
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


## Problem 7

In this problem, you need to check if the entered string "s" consists entirely of digits, for this I created the consistsOnlyDigits(String s) function to check if the condition is met.

### Definition:
    @consistsOnlyDigits - recursive function that checks string is consists of  only digits
    @firstsymbol - first symbol of string
    @return - returns the true or false if statement is right

### Solution:
    import java.util.Scanner;
    public class problem7 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();//entered line of string
                if (consistsOnlyDigits(s)) {
                    System.out.println("Yes");//statement checks string consists of only digits, if yes, then print "yes"
            }
                else {
                    System.out.println("No");//if statement is false, print false
            }
        }
        public static boolean consistsOnlyDigits(String s) {
        // base case
            if (s.isEmpty()) {
                return true;//returns true if string s consists of only digits
            }
        // recursive case
            else {
                char firstsymbol = s.charAt(0);
            if (Character.isDigit(firstsymbol)) {
                String anotherpartOfString = s.substring(1);//another part of string(after the first symbol)substrings of original string
                return consistsOnlyDigits(anotherpartOfString);//returns consistsOnlyDigits if first symbol of string is digit
            }
            else {
                return false;//return false if string doesn't consist of only digits
            }
        }
        }
    }

## Problem 8

In this task, I wrote a code to reverse the value of the array in reverse order, for this the user had to enter the value of n and the value of the array, also use recursion and create a function (reversedArr(int[] arr, int start, int end)).

### Definition:
    @n - entered variable,size of array
    @arr - set of elements of array will be entered
    @reversedArr - method to reverse the array
    @start - first index of part of array
    @end - last index of part of array

### Solution:
    import java.util.Scanner;
    public class problem8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();//entered num
            int[] arr = new int[n];
            //implements each element to array
            for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();//reading each elements of array
        }
    
            // call the reversedArr to reverse the array
            reversedArr(arr, 0, n - 1);
            //print the elements of array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void reversedArr(int[] arr, int start, int end) {
            //base case
            if (start >= end) {
                return;//return if the start more than or equals to end
            }
            //swapping the elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
    
            reversedArr(arr, start + 1, end - 1);//reverse the gotten subarray from array
        }
    }

## Problem 9

In this problem I wrote a code to calculate the binomial coefficient of the input values n and to do this I created a function calculateBinomCoeff(int n , int k) and returned the value if n was equal to k or k was equal to 0.

### Definition:
    @n - entered value of n
    @k - entered value of k
    @total - store the result
    @return - return 1 if n equals to k or k equals to 0
    @calculateBinomCoeff - function that calculate the binomial coefficent

### Solution:
    import java.util.Scanner;
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
            }
            //recursive case
            return calculateBinomCoeff(n-1, k-1)*(n-k+1)/k;//calculate the C(n-1, k-1) and multiple it to (n-k+1)/k
        }
    }

## Problem 10

In this problem, I wrote a code to calculate the GCD of the entered numbers a and b, and to do this, I entered the function calculateGcd(int a, int b) and returned the value of a if the value of b was equal to 0.

### Definition:
    @a - entered integer as parameters for GCD
    @b - entered integer as parametrs for GCD
    @res - result of calculating GCD
    @calculateGcd - calculate the GCD of two integers
    @return - return value of a if b equals to 0

### Solution:
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

