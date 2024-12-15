import java.util.*;/*cound digit*/
class countdigit
{
    public static void main(String [] args)
    {
        int n=325345;
        int count =0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        System.out.println(count);
    }
}