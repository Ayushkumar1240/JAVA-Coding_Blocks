package Sorting;

import java.util.*;
public class MergeSort
{
    public static void mergSort(int arr[],int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        mergSort(arr,low,mid);
        mergSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else
            {
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            list.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=list.get(i-low);
        }
    }
	public static void main(String[] args) 
	{
		int arr[]={3,1,2,4,1,5,2,6,4};
		int low=0;
		int high=arr.length-1;
		mergSort(arr,low,high);
		for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i]);
		}
	}
}

