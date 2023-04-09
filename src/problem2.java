/*
    @arr - array
    @findarravg - method is a recursive method that calculates the average of an array of integers
*/
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