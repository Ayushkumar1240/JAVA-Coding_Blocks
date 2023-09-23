//   05-07-2023
//                              BINARY SEARCH
//----------------------------------------------------------------------------------

//      Search Space Sorted


// public class DayEleven {
//     public static int search(int arr[],int target)
//     {
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end)
//         {
//             int mid=(start+end)/2;
//             if(arr[mid]==target)
//             {
//                 return mid;
//             }
//             else if(arr[mid]<target)
//             {
//                 start=mid+1;
//             }
//             else
//             {
//                 end=mid-1;
//             }

//         }
//         return -1;

//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         int target=3;
//         System.out.println(search(arr,target));
//     }
// }







//                    Question -> find the square root
//             n=25  ->  5
//             n=27  ->  5
//             n=36  ->  6
//             n=40  ->  6



class DayEleven{
    
    public static void main(String[] args) {
        int n=49;
        int start=0;
        int end=n;
        int ans=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int sq=mid*mid;
            if(n>=sq)
            {
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);
        

    }
}






