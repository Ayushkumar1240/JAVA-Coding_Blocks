//   ARRAYS
//   array ka variable STACK memeory me allocate hota hai magar space HEAP memory me milta hai
//   

// public class DaySix {
//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         System.out.println(arr);     // [I@1db9742 => [-> array hai , I-> Integer , baki ka address
//         for(int k:arr)
//         {
//             System.out.print(k);
//         }
//     }
// }





// public class DaySix {
//     private static void swap(int a,int b)
//     {
//         int temp=a;
//         a=b;
//         b=temp;
//     }
//     private static void swap2(int[] arr,int[] brr)
//     {
//         int temp=arr[0];
//         arr[0]=brr[0];
//         brr[0]=temp;
//     }
//     private static void swap3(int a,int b)
//     {
//         int temp=a;
//         a=b;
//         b=temp;
//     }
//     private static void swap4(int[] arr,int[] brr)
//     {
//         int temp=arr[0];
//         arr[0]=brr[0];
//         brr[0]=temp;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         int brr[]={6,7,8,9,10};
//         int a=arr[0];       //1
//         int b=brr[0];       //6 

//         System.out.println(arr[0]+ " "+brr[0]);
//        swap(a,b);
//        swap2(arr,brr);
//        swap3(arr[0],brr[0]);
//        swap4(arr,brr);
//        System.out.println(arr[0]+ " "+brr[0]);
        
//     }
// }






public class DaySix{
    public static void main(String[] args) {
        int n=8;
        int arr[]={3,4,7,6,1,9,10,8};

        int temp=0;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0)
            {
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}