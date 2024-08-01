class A1
{
	int x;
	void setA(int a)
	{
		x=a;
	}
}
class B1 extends A1
{
	int y;
	void setB(int b)
	{
		y=b;
	}
}

public class MultilevelInheritence extends B1
{
	int product;
	void getP(int x,int y)
	{
		product = x*y;
		System.out.println("The product is :"+product);
	}

	public static void main(String[] args) 
	{
		MultilevelInheritence m = new MultilevelInheritence();
		m.getP(10,20);

	}

}
