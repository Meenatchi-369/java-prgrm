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
/*Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.
Input
Nandy
Raja
5
Expected output:
NandyRaja
NandyRaja
NandyRaja
NandyRaja
NandyRaja
Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.
Complete & continue
*/