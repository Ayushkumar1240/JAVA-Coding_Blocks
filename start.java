import java.util.*;
public class start {
    static boolean ispalindrome(String str)
    {
        int low=0;
        int high=str.length()-1;
        while(low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(ispalindrome(str))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }
    }
}
