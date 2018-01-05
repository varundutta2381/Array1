package Array2;

public abstract class ThreeD 

{

	public static void main(String[] args) 
	
	{
		
		// declare three vars
		int dept,student,marks, tot=0;
		
		//take the marks of students in a 3D array
		
		int arr[][][] = {{{50,51,51},{60,61,62}},{{70,71,72},{80,81,82}},{{65,66,67},{75,76,77}}};
		
		//Display the marks from 3D array
		
		for (dept = 0;dept<3;dept++)
		{
			System.out.println("Department "+(dept+1)+": ");
			for (student = 0;student<2;student++)
			{
				System.out.print("Student "+(student+1)+" marks: ");
				for (marks = 0;marks<3;marks++)
				{
					System.out.print(arr[dept][student][marks]+" ");
					tot += arr[dept][student][marks];
				}
				System.out.println("Total:"+ tot);//display total marks of students
				tot = 0;  //reset total to 0
				
					
			}
			
			System.out.println();//end of loops
			
		}
		

	}

}
