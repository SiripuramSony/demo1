
class ConstructorBase
{
	ConstructorBase()
	{
		System.out.println("Base Class Constructor");
	}
}

class Derived extends ConstructorBase
{
	Derived()
	{
		System.out.println("Derived class Constructed");
	}

}

class Test
{
	public static void main(String[] args) 
	{
		new Derived();
	
	}
}
