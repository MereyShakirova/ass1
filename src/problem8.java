/*
@n - entered variable,size of array
@arr - set of elements of array will be entered
@reversedArr - method to reverse the array
@start - first index of part of array
@end - last index of part of array
*/
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

