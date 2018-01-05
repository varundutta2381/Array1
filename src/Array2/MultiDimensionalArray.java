package Array2;

public class MultiDimensionalArray 
{

	public static void main(String[] args) 
	
	{
		
		int[] values = {3,5,2345};
		System.out.println(values[2]);
		
		int[][] grid = {
				
				{3,5,8},
				
				{8,9},
				
				{1,2,4,6},
							
		};
		
		System.out.println(grid[0][0]);
		System.out.println(grid[0][1]);
		System.out.println(grid[0][2]);
		
		
		System.out.println(grid[1][0]);
		System.out.println(grid[1][1]);
		
		String[][] texts = new String[2][3];
		
		texts[0][1] = "Hello There";
		
		System.out.println(texts[0][1]);
		
		for (int row = 0;row<grid.length; row++)
		{
			for (int col= 0;col < grid[row].length;col++)
			{
				System.out.print(grid [row][col] + "\t");
			}
			
			System.out.println();
		}
			
		
		
		

	}

}
