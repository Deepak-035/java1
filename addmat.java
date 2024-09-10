import java.util.Scanner;
public class addmat{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int N = Integer.parseInt(args[0]);
		int[] [] matrix1=new int[N] [N];
		int[] [] matrix2=new int[N] [N];
		int[] [] summatrix=new int[N] [N];
		int i,j;
		System.out.println("Enter the elements of first matrix: ");
		for(i=0;i<N;i++)
		{
			for(j=0; j<N; j++)
			{
				matrix1[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter the elements of secound matrix: ");
		for(i=0; i<N; i++)
		{
			for(j=0; j<N ;j++)
			{
				matrix2[i][j]=scanner.nextInt();
			}
		}
		System.out.println("The 2 matrix is " );
		for(i=0;i<N;i++)
		{
			for(j=0; j<N; j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(i=0; i<N; i++)
		{
			for(j=0; j<N; j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of 2 matrix is ");
		for(i=0; i<N; i++)
		{
			for(j=0; j<N; j++)
			{
				summatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println();
		for(i=0; i<N; i++)
		{
			for(j=0; j<N; j++)
			{
				System.out.print(summatrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
		
				
			
 
		
