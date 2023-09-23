//                              BUBBLE SORT
//  -----------------------------------------------------------------------------------


public class DaySeven 
{
    public static void bubbleSort(int arr[])
    {
        for(int pass=0;pass<arr.length-1;pass++)
        {
            for(int i=0;i<arr.length-1-pass;i++)
            {
              if(arr[i]>=arr[i+1])
              {
                 swap(arr,i,i+1);
              }
            }
        }
    }
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) 
    {
        int arr[]={4,3,7,6,9};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
