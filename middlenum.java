import java.util.*;
class main
{
    public static void main(String [] args)
    {
        int a=45, b=23, c=567;

        if(a>=b && a<=c || a>=c && a<=b)
        {
            System.out.println("a is a middle Num ");
        }
        else if(b>=a && b<=c || b>=a && b<=c)
        {
        System.out.println("b is a middle Num ");
        }
        else
        {
        System.out.println("c is a middle Num "); 
        }
    }
}