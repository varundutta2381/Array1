package Array2;

import java.io.*;

public class Array4 {

	public static void main(String args[]) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(newInputStreamReader(System.in));
		
		System.out.print("How many subjects?");
		int n = Integer.parseInt(br.readLine());
		
		int[] marks = new int[n];
		
		for (int i=0;i<n;i++)
		{
			System.out.print("Enter Marks: ");
			marks[i]= Integer.parseInt(br.readLine());
		}
		
		int tot = 0;
		for (int i=0;i<n;i++)
			tot += marks[i];
		
		System.out.println("Total marks= "+ tot);
		
		float percent = (float)tot/n;
		System.out.println("Percentage= "+ percent);
		

	}

	private static Reader newInputStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

}
