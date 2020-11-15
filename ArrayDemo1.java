class ArrayDemo1
{
	public static void passByReference(String a[])
	{
		a [0] = "Changed";
	}
	public static String passByValue(String a)
	{
		return a="Changed again";
	}
	public static String[] getArray()
	{
		String a[]={"Satu", "dua", "tiga"};
		return a;
	}
	public static void main(String args[])
	{
		String []b;

		b=getArray();
		for(String v:b)
			System.out.println(v);

		System.out.println(b.length);
		
		//String[]b={"Apple", "Mango", "Orange"};
		// System.out.println("Before function call " +b[0]);


		// for(String v:b)
		// 	System.out.println(v);
		// ArrayDemo1.passByReference(b);

		// System.out.println("Before function call " +b[0]);
		// for(String v:b)
		// 	System.out.println(v);

		//System.out.println("The return value: " + ArrayDemo1.passByValue(b[0]));
		//System.out.println("the array: ");
		//for(String v:b)
		//System.out.println(v);
	}
}