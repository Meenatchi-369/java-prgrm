import java.util.*;
class main2
{
public static void main(String[] args) 
{
        int n=23423573, count=0;
        while(n>0){
             int ld = n%10;
            if(ld%2==0)
            {
            count = count + 1;
            }
            if(n==ld){
                System.out.println(ld);
            }
                                    n=n/10;
        }
        System.out.println(count);
    }
}
