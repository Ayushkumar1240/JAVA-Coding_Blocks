//       27-06-2023


//    Find the last index of 2
// ---------------------------------------------------------------------------------------

// class DayEight{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,-10,-11,2,7,9,2,11};
//         int idx=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]==2)
//             {
//                 idx=i;
//             }
//         }
//         System.out.println(idx);
//     }
// }






//                             SELECTION SORT
//----------------------------------------------------------------------------------

class  DayEight{
    public static void selectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,3,12,45,98};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
        }
    }
}