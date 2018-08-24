
public class StarExample {
	
	static int row=15;
	
	public static void main(String args[])
	{
		
		for(int i=0;i<row;i++)
		{
			int k =row;
			for(int j=i;j<k;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			
			
			for(int j=i+i;j<=k+k;j++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		for(int i=row;i>=0;i--)
		{
			int k =row;
			for(int j=i;j<k;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			for(int j=i+i;j<=k+k;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		
		
	
	}
}
