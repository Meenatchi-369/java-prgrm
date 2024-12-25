import java.util.*;
class sumofseries3
{
    public static void main(String [] args)
    {
        int n=3,sum=0, x=0;
        for(int i=1; i<=2*n-1; i=2+i)
        {
            x=x+i;
            sum=sum+x;
        }
        System.out.println(sum);
    }
}