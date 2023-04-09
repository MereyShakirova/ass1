# ass1
In this reprository, I wrote codes for laboratory work for Algorithm data structure by using recursion and recursion.
#Problem1
In this problem, I used functions and recursion to find the minimum value among the arrays
#Definition
#Solution
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
