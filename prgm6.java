import java.util.*;
class prgm6{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    String name1=sc.nextLine();
    int num = sc.nextInt();
    String a = name+name1;
    for(int i=1; i<=num; i++)
    {
        System.out.println(a);
    }
}
}
