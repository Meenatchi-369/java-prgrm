import java.util.*;
class prgm2{
public static void main(String args[])
{
Scanner scan =new Scanner(System.in);
String name = scan.nextLine();
int age = scan.nextInt();
scan.nextLine();
char letter = scan.next().charAt(0);
System.out.println("my name is "+ name);
System.out.println("my age is "+ age);
System.out.print("The letter  is "+ letter);
}
} 
