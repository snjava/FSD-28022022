/*
	*
	*	*
	*	*	*
	*	*	*	*
	*	*	*	*	*
*/

public class Pattern1
{
	public static void main(String args[])
	{
		for(int r = 1 ; r <= 5 ; r++ )   // row
		{
			for(int c = 1 ; c <= r ; c++ )   // column
			{
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
	}
}