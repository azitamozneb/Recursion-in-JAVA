// This is a simple recursion code to show
// how recursion works 
public class EndlessRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		Endless.message(5);		//This is a  limited recursion 
 		System.out.println("Back to main");
 		Endless.message();		//This is an unlimited recursion

	}
	// Create Endless class
	public static class Endless
	{
		public static void message(int n)
		{
			if (n>0)
			{
				System.out.println("This is a recursion method");
				message(n-1);
			}
		}
		public static void message()
		{
			System.out.println("This is an Endless recursion method");
			message();

		}
	}

}
