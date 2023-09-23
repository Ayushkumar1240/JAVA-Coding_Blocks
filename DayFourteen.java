//  11-07-2023

//                                 STRING
//-------------------------------------------------------------------------------------

//  immutable  ->  same memory location pe changes nahi honge
public class DayFourteen {
       public static void main(String[] args) {
        String str="nitin";                           //  literal declaration  //  in SCP
        String str2="Hello";
        String str3=new String("Hello");              //  object declaration   // in HEAP MEMORY


//      str.concat("abc");                            //   hello
        str=str.concat("abc");                        //   helloabc
        System.out.println(str);


        System.out.println(str.charAt(2));
        System.out.println(str.concat("gh"));
        System.out.println(str.contains("H"));
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());               //  removes space from front and back
        System.out.println(str.substring(2));
        System.out.println(str.substring(0,4));
        System.out.println();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
                
            }
        } 

    }
}

//               ==  -> compares referece
//               .equals()  -> content comparision
//               .compareTo()  ->   +ve ,0 , -ve  (ASCII DIFFERENCE)  if length 
//                                  of one is greater then return the length difference
//                A-Z  ->66 -90
//                a-z  ->97 -122
//                0-9  ->48 -57
