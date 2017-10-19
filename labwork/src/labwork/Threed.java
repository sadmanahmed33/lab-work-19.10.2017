package labwork;

import java.util.Scanner;

public class Threed implements Shape{
	public void area()
	{
		int a=0,b=0,c=0;
		Scanner scr=new Scanner(System.in);
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		System.out.println("my area is "+a*+b*+c);
	}
	public void dimension()
	{
		System.out.println("i am in 3 d object");
	}

}
