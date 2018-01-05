package Array2;
import java.io.*;
import java.util.Scanner;


public class Transpose 

{

	public static void main(String[] args) throws IOException
	
	{
		// Use scanner to accept data from keyboard
		Scanner sc = new Scanner(System.in);
		
		//Accept rows and columns of a matrix
		
		System.out.println("Enter rows,columns? ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		//create an array with size [r][c]
		int arr[][] = new int [r][c];
		
		//accept a matrix from keyboard
		
		System.out.println("Enter elements of matrix : ");
		
		for (int i = 0;i<r;i++)
			for (int j = 0;j<c;j++)
				arr[i][j] = sc.nextInt();
		
		System.out.println("The transpose matrix: ");
		
		//take columns as rows and vice versa and display
		for (int j =0;j<c;j++)
		{
			for (int i = 0;i<r;i++)
			{
				System.out.println(arr[i][j]+ " ");
			}
System.out.println("\n");
		}
		


	}

}
