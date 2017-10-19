package labwork;

public class activity_main {

	public static void main(String[] args)
	{
		Shape s=(Shape) new Square();
		Doo d=new Doo();
		d.dosomething(s);
		Variadic a=new Variadic();
		a.print(1,2,3,4);
		//a.make(s);
	}
}
