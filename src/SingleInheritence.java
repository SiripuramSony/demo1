class Parent
{
	public void A()
	{
		System.out.println("This is parent");
	}
}

class Child extends Parent
{
	public void B()
	{
		System.out.println("This is Child");
	}
}
public class SingleInheritence {

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.A();
		c.B();
	}

}
