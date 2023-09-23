public class DaySeventeen {
    public static void main(String[] args) {
        int arr[]={8,-8,9,-9,10,-11,12};
        int n=7;
        int max=Integer.MIN_VALUE;
        

        int start=0;
        while(start<=arr.length)
        {
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    sum=sum+arr[j];
                    if(j==arr.length)
                    {
                        j=0;
                    }
                }
            }
        }
    }
}
