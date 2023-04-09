/*
    @findMin - function that finds the minimum value in an array
    @min - call the findMin to find the minimum value of array
    @return - returning the minimum value of function
    @arr - array
 */
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

