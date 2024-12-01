import java.util.*;
class prgm3{
public static void main(String args[])
{
Scanner scan =new Scanner(System.in);
int a = scan.nextInt();
if(a<=100)
{
    if(a<35)
    {
        System.out.print("Fail");
    }
    else if(a>=35 && a<=60)
    {
     System.out.print("Grade D");
    }
    else if (a>=60 && a<=80)
    {
    System.out.print("Grade C");
    }
    else if(a<=80 && a<=90)
    {
     System.out.print("Grade B");
    }
    else
    {
    System.out.print("Grade A");
    }
}
}
}