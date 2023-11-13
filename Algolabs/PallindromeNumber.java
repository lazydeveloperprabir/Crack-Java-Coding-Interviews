/**
 * @author : lazydeveloper
 * @mailto : lazydeveloperprabir@gmal.com
 * @created : 14-11-2023, Tuesday
 * <p>
 * ::::::::::::::::::::: Problem Statement ::::::::::::::::::::::::::::::::
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Note: Converting the integer to a string is not recommended.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 **/
public class PallindromeNumber {
    public static void main(String[] args) {
        System.out.println(checkPallindrome(121));
        System.out.println(checkPallindrome(-121));
        System.out.println(checkPallindrome(10));
    }
    public static boolean checkPallindrome(int x){
        int rev = 0;
        int num = x;

        while(num > 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (x == rev){
            return true;
        } else {
            return false;
        }
    }
}

/*
:::::::::::::::::::::The Output for the above program :::::::::::::::::::
*/
