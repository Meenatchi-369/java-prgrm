import java.util.*;
class patterncode8
{
    public static void main(String [] args)
    {
        int n=6;
        for(int i=1; i<=6;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}/*Sample 1:

Input:

n = 4

Expected output:

*

**

***

****



Sample 2

Input:

n= 6

*

**

***

****

*****

******


Complete & continue
*/