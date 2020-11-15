import java.util.HashSet;

public class DemoSet
{
	public static void main(String[]args)
	{
		HashSet<String>setFruits = new HashSet<String>();

		setFruits.add("rambutan");
		setFruits.add("jackfruit");
		setFruits.add("mangosteen");
		setFruits.add("jackFruit");  //print sebab capital tak sama

		System.out.println(setFruits);
	}
}