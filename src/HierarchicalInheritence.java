class Tree
{
	void tree()
	{
		System.out.println("This is tree");
	}
}

class Fruite extends Tree
{
	void fruites()
	{
		System.out.println("This is fruits");
	}
}

class Leaf extends Tree
{
	void  leafs()
	{
		System.out.println("This is leafs");
	}

	
}

public class HierarchicalInheritence {

	public static void main(String[] args) 
	{
		Leaf x = new Leaf();
		x.leafs();
		Fruite y=new Fruite();
		y.fruites();
		x.tree();
	}

}
