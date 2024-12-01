import java.util.*;
class prgm4
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch(num)
        {
            case 29:
                System.out.println("The size is Small");
                break;
            case 30:
                 System.out.println("The size is Medium");
                 break;
            case 38:
                 System.out.println("The size is Large");
                 break;
            case 42:
                System.out.println("The size is X Large");
        }
    }
}
