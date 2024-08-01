import java.util.Scanner;

class single
{
	static Scanner sc =new Scanner(System.in);
	void S(int a)
	{
		System.out.println(a);
	}
}

class Multi extends single
{
	void M(float a)
	{
		System.out.println(a);
	}
}

class hie extends Multi
{
	void H(char a)
	{
		System.out.println(a);
	}
}

class child1 extends hie
{
	void c1()
	{
		System.out.println("This is child1");
	}
}

class child2 extends hie
{
	void c2()
	{
		System.out.println("This is child2");
	}
}

public class HybridInheritence {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		hie x = new hie();
		x.S(sc.nextInt());
		x.M(sc.nextFloat());
		x.H(sc.next().charAt(0));
		child1 c =new child1();
		c.c1();
		child2 z=new child2();
		z.c2();
		

	}

}
