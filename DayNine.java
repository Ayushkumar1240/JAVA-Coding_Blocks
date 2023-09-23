
//      INPUT ->  {1,2,3,4}
//      OUTPUT -> {24,12,8,6}
//                                2*3*4=24
//                                1*3*4=12
//                                1*2*4=8
//                                1*2*3=6
//  our task is to return the multiply of the whole array except of that particular index
//  on which we are.




// public class DayNine {
//     public static void main(String[] args) {
//         int arr[]={1,0,3,4};
//         int out[]=new int[arr.length];
//         for(int i=0;i<arr.length;i++)
//         {
//             int mul=1;
//             for(int j=0;j<arr.length;j++)
//             {
                
//                 if(j==i)
//                 {
//                     continue;
//                 }
//                 else{
//                     mul=arr[j]*mul;
//                 }
//             }
//             out[i]=mul;
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(out[i]);
//         }
//     }
    
// }




// class DayNine{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//         int out[]=new int[arr.length];
//         int res=1;
//         for(int i=0;i<arr.length;i++)
//         {
//             res=arr[i]*res;
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             out[i]=res/arr[i];
//         }
//         for(int i=0;i<arr.length;i++)
//         {
//             System.out.println(out[i]);
//         }
//     }
// }




import java.util.*;

// class DayNine{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4};
//         int out[]=new int[arr.length];
//         int left[]=new int[arr.length];
//         int right[]=new int[arr.length];
//         int product=1;
//         int product2=1;;
//         left[0]=product;
//         right[arr.length-1]=product2;
//         for(int i=1;i<arr.length;i++)
//         {
//            product=product*arr[i-1];
//            left[i]=product;
//         }
//         System.out.print(Arrays.toString(left));

//         for(int i=arr.length-2;i>=0;i--)
//         {
//            product2=product2*arr[i+1];
//            right[i]=product2;
//         }
//         System.out.print(Arrays.toString(right));
//         System.out.println();

//         for(int i=0;i<arr.length;i++)
//         {
//            out[i]=left[i]*right[i];
//         }

//         for(int i=0;i<arr.length;i++)
//         {
//           System.out.println(out[i]);
//         }
//     }
// }



//                              SUB SEQUENCE SUM
// --------------------------------------------------------------------------




// class DayNine{

//    static void f(int index,int arr[],ArrayList<Integer> list)
//    {
//       if(index>=arr.length)
//       {
//          System.out.println(list);
//          return;
//       }
//       list.add(arr[index]);
//       f(index+1,arr,list);
//       list.remove(list.size()-1);
//       f(index+1,arr,list);
//    }

//    public static void main(String[] args) {
//       int arr[]={1,2,3,4};
//       ArrayList<Integer> List=new ArrayList<>();
//       f(0,arr,List);
//    }
// }








// class DayNine{
//    public static void main(String[] args) {
//       int arr[]={1,2,3,4};
//       int ans=Integer.MIN_VALUE;
//       for(int i=0;i<arr.length;i++)
//       {
//          for(int j=i;j<arr.length;j++)
//          {
//             int sum=0;
//             for(int k=i;k<=j;k++)
//             {
//                sum+=arr[k];
//             }
//             ans=Math.max(ans,sum);
//          }
//       }
//       System.out.println(ans);
//    }
// }






// class DayNine{
//    public static void main(String[] args) {
//       int arr[]={1,2,3,4};
//       int ans=Integer.MIN_VALUE;
//       for(int i=0;i<arr.length;i++)
//       {
//          int sum=0;
//          for(int j=i;j<arr.length;j++)
//          {
//             sum+=arr[j];
//             ans=Math.max(ans,sum);
//          }
//       }
//       System.out.println(ans);
//    }
// }






//                              KADEN'S ALGORITHM
//  ---------------------------------------------------------------------------------

//     agar sum -ve ho jaa rha hai to sum ko 0 kar do

// class DayNine{
//    public static void main(String[] args) {
//       int arr[]={1,2,-10,4,5};
//       int ans=Integer.MIN_VALUE;
//       int sum=0;
//       for(int i=0;i<arr.length;i++)
//       {
//          sum+=arr[i];
//          ans=Math.max(ans,sum);
//          if(sum<0){
//             sum=0;
//          }
//       }
//       System.out.println(ans);
//    }
// }








//                           MINIMUM SUBARRAY SUM
//-------------------------------------------------------------------------------------

class DayNine{
   public static void main(String[] args) {
      int arr[]={1,2,-10,-4,5};
      int ans=0;
      int sum=0;
      for(int i=0;i<arr.length;i++)
      {
         sum+=arr[i];
         ans=Math.min(ans,sum);
         if(sum<0){
            sum=0;
         }
      }
      System.out.println(ans);
   }
}
