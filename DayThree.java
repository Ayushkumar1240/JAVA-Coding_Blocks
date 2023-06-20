public class DayThree
{
    public static void main(String[] args) 
    {
        int n=7;
        int nst=n/2;
        int nsp=1;

        int row=0;

        while(row<n)
        {
            for(int i=0;i<nst;i++)
            {
                System.out.print("* ");
            }
            for(int i=0;i<nsp;i++)
            {
                System.out.print(" ");
            }
            for(int i=0;i<nst;i++)
            {
                System.out.print("* ");
            }
            if(row<n/2)
            {
                nst--;
                nsp++;
            }
            else
            {
                nst++;
                nsp--;
            }
            System.out.println();
            row--;
        }
    }
}

