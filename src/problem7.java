/*
    @consistsOnlyDigits - recursive function that checks string is consists of  only digits
    @firstsymbol - first symbol of string
    @return - returns the true or false if statement is right
*/
import java.util.Scanner;
public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();//entered line of string
            /*if (consistsOnlyDigits(s)) {
                System.out.println("Yes");//statement checks string consists of only digits, if yes, then print "yes"
            } else {
                System.out.println("No");//if statement is false, print false
            }*/
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

