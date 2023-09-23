//  11-06-2023
//             PALINDROMIC SUBSEQUENCE  /  LONGEST PALINDROMIC SUBSEQUENCE
//------------------------------------------------------------------------------------



// public class DayFifteen {
    // static boolean ispalindrome(String str)
    // {
    //     int low=0;
    //     int high=str.length()-1;
    //     while(low<high)
    //     {
    //         if(str.charAt(low)!=str.charAt(high))
    //         {
    //             return false;
    //         }
    //         low++;
    //         high--;
    //     }
    //     return true;
 
    // }
//     public static void main(String[] args) {
//         String str="nitin"; 
//         String ans="";
//         for(int i=0;i<str.length();i++)
//         {
//             for(int j=i+1;j<=str.length();j++)
//             {
//                 if(ispalindrome(str.substring(i,j)))
//                 {
//                     System.out.println(str.substring(i,j));
//                 }
                
//             }
//         }
//     }
// }














public class DayFifteen {
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
        String str="nitin"; 
        String ans="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                if(ispalindrome(str.substring(i,j)))
                {
                    System.out.println(str.substring(i,j));
                }
                
            }
        }
    }
}
