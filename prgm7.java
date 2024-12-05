/*
Write a program which takes two values x and y. Prints x for y number of times.
Input:
2 
3
Expected Output
2
2
2
Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output
*/
import java.util.*;
class prgm7
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int num1= sc.nextInt();
        for (int i=1; i<=num1; i++)
        {
            System.out.println(num);
        }
    } 
}