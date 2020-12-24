package prestigepoint.ArrayPrograms;
//. Write a program to check that the elements of a matrix are distinct
import java.util.Scanner;

public class MatrixDistinctElements {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of rows ");
		int row=s.nextInt();
		System.out.println("enter no of cols ");
		int col=s.nextInt();
		int i,j,flag=0;
		int m1[][]=new int[row][col];
		System.out.println("enter elements in m1");
		for( i=0;i<row;i++)
		{
			for( j=0;j<col;j++)
			  m1[i][j]=s.nextInt();
			 
		}
		System.out.println("our matrix=");
		for( i=0;i<row;i++)
		{
			for( j=0;j<col;j++)
			{ System.out.print(m1[i][j]+" ");}
			System.out.println(" ");
	    }
		for( i=0;i<row-1;i++)
		{
			for( j=0;j<col-1;j++)
			{
				if(m1[i][j]==m1[i+1][j+1])
				{
					flag=1;
					//break;
            
			}
		}
			if(flag==1)
			{
				System.out.println("not distinct");
			}
			else
			{
				System.out.println("distinct");
			}
			}
		s.close();
		
}
}