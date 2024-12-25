import java.util.*;
class sumofseries2
{
    public static void main(String [] args)
    {
        int n=5,sum=0, seriesterm=0;
        for(int i=1; i<=n; i++)
        {
            sum=sum+i;
            seriesterm=seriesterm+sum;
        }
        System.out.println(seriesterm);
    }
}