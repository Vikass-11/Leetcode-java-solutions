import java.util.Scanner;
class Solution {
    public static boolean isPalindrome(int x) {
        int original=x;
        int rev=0;
        while(x>0){
            int v=x%10;
            rev=rev*10+v;
            x/=10;
        }
        return original==rev;
    }
}
    