import java.util.*;
class patterncode9
{
    public static void main(String [] args)
    {
        int n=6;
        for(int i=1; i<=6; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=1; i<=n-1; i++)
        {
            for(int j=1; j<=n-i-1+1; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}