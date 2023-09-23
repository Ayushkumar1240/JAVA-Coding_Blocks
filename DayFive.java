//  HCF OR GCD

// public class DayFive 
// {
//     public static void main(String[] args) {
//         int Divisor=60;
//         int Dividend=36;

//         while(Dividend%Divisor!=0)
//         {
//             int rem=Dividend%Divisor;
//             Dividend=Divisor;
//             Divisor=rem;
//         }
//         System.out.println(Divisor);
//     }
    
// }







//  REVERSE DIGIT

// public class DayFive
// {
//     public static void main(String[] args) 
//     {
//         int digit=12345;
//         int rem=0;
//         int result=0;
//         while(digit!=0)
//         {
//             rem=digit%10;
//             result=result*10+rem;
//             digit=digit/10;
//         }
//         System.out.println(result);
//     }
// }











//    PRIMITIVE DATA TYPES  -> byte   ,   long ,    int ,    short ,   float ,   double,   char,   boolean
//                            (1 byte)   (2 byte)  (4 byte) (8 byte)  (4 byte)  (8 byte)  (2 byte) (1 bit)

//    byte  ->  -128 to 127




//   ARGUMENTS -> passed during method creation
//   PARAMETERS  -> passed during method call
//   STATIC  -> when used with method no need to create an object to call that method





public class DayFive{
    public static void main(String[] args) {
        int num=32145;
        int rem=0;
        int result[]=new int[5];
        int i=1;
        while(num!=0)
        {
            rem=num%10;
            result[rem-1]=i;
            num=num/10;
            i++;
        }
        for(int j=4;j>=0;j--)
        {
            System.out.print(result[j]);
        }
        
    }
}



// import java.util.*;

// public class DayFive{
//     public static void main(String[] args) {
//         int num=32145;
//         int rem=0;
//         int result=0;
//         int i=1;
//         while(num!=0)
//         {
//             rem=num%10;
//            // result=Math.pow(10,rem-1);
//             num=num/10;
//         }
       
        
//     }
// }