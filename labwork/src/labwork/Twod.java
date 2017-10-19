package labwork;
import java.util.Scanner;

public   class Twod implements Shape {
public void dimention()
{
	System.out.println("i am in dimension");}
public void area()
{
	int a=0,b=0;
	Scanner scr=new Scanner(System.in);
	a=scr.nextInt();
	b=scr.nextInt();
	System.out.print("my area is" +a*+b );
}
}