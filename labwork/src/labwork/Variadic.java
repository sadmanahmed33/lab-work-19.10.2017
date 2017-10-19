package labwork;

public class Variadic {
	
	public void print(int... args)
	{
		for(int arg : args)
		{
			System.out.print(arg+" ");
		}
	}

}
