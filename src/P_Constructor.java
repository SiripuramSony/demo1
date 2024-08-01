

class Base
{
	int x;
	Base(int a)
	{
		x = a;
		System.out.println("This is Base :"+x);
	}
}

class Derived1 extends Base
{
	int y;
	Derived1(int a,int b)
	{
		super(a);
		y = b;
		System.out.println("This is Super :"+y);
	}
}

public class P_Constructor {

	public static void main(String[] args) 
	{
		Derived1 d = new Derived1(10,20);
		
	}

}
