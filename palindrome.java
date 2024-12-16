import java.util.*;/*cound digit*/
class palindrome
{
    public static void main(String [] args)
    {
           int n = 5225, rev= 0;
       int x = n;
       while(n>0){
           rev=rev*10+(n%10); //rever*10+lastdigit
           n=n/10;
       }
       if(rev==x){
           System.out.println("Palindrome");
       } else{
           System.out.println("Not Palindrome");
       }
    }
}
     

