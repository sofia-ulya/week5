public class ArrayDemo
{
	public static void main(String [] args) 
	{
		//declare &create an array of integers
		// int[] anArray = new int[10];	//default value 0

		// //assign a value to each array element and print
		// //array 1D size via array.length
		// for(int i=0; i<anArray.length; i++)
		// {
		// 	anArray[i]=i;
		// 	System.out.print(anArray[i]+ " ");

		// }

		// System.out.println();


		// 2D array with 10 rows and 3 columns
		int[][] anArray = new int[10][3];
		System.out.println("Length ? "+anArray.length);   //keluarkan row size
		System.out.println("Length ? "+anArray[0].length);  ////keluarkan column size

		// int[] valA = {12,23,45,56};
		// int[] valB = new int[4];
		// valB = valA;
		// // valB[0] = valA[0];
		// // valB[1] = valA[1];
		// // valB[2] = valA[2];
		// // valB[3] = valA[3];
		// for(int i = 0; i<valB.length;i++)
		// 	System.out.println("indek "+i+" " +valB[i]);
			



		// int[] data = {23, 38, 14, -3, 0, 14, 9, 103, 0, -56 ,88};
		// System.out.println("Size array is "+data.length);
		// System.out.println("Element indeks ke 10 "+data[10]);



		// double[] val= new double[4]; //an array of double
		// val[0] = 0.12; 
		// val[1] = 1.43; 
		// val[2] = 2.98;
		// int j = 3; 
		// System.out.println( val[ j ] ); 
		// System.out.println( val[ j-1 ] );
		// j = j-2; 
		// System.out.println( val[ j ] );
		}
	}