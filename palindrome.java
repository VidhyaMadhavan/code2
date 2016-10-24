import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int number,num,revnum=0,rem=0;
System.out.println("Enter number:");
number=sc.nextInt();
num=number;
while(number!=0)
{
rem=number%10;
revnum=(revnum*10)+rem;
number=number/10;
}
if(num==revnum)
{
System.out.println("Entered number is palindrome");
}
else
{
System.out.println("Not a palindrome");
}
}
}
