import java.util.*;/*cound digit*/
class firstandlastdigit
{
    public static void main(String [] args)
    {
         int n=12345, count=0;
         int first=0;
         int last=0;
         last=n%10;
         while(n>0)
         {
            int fd=n%10;
            count++;
            n=n/10;
            if(n==0)
            {
                System.out.println("first digit:" +fd);
            }
                   
                   }
                            System.out.println("Last digit :" +last);


    }
}


