public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        double result = findarravg(arr, arr.length);
        System.out.println("Average of this arr is " + result + ".");
    }

    public static double findarravg(int[] arr, int a) {
        if (a == 0) {
            return 0;
        }
        else {
            return (arr[a-1] + (a-1)*findarravg(arr, a-1)) / a;
        }
    }
}