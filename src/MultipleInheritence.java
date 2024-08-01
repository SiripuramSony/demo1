interface A
{
	default void show()
	{
		System.out.println("interface1");
	}
}
interface B
{
	default void show()
	{
		System.out.println("interface2");
	}
}

public class MultipleInheritence implements A, B
{
	public void show()
	{
		A.super.show();
		B.super.show();
		System.out.println("Overridden method of A");
	}
	public static void main(String[] args) 
	{
		MultipleInheritence x = new MultipleInheritence();
		x.show();
	}

}
