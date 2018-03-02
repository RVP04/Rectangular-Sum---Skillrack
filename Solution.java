import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//getting the input as rows and cols
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		for(int i =0;i<rows;i++)
		for(int j =0;j<cols;j++)
		    matrix[i][j]=sc.nextInt();
		
		//getting the indices from input
		int top = sc.nextInt();
		int left = sc.nextInt();
		int bottom = sc.nextInt();
		int right = sc.nextInt();
		
		//processing
		int sum = 0;
		for(int i=top;i<=bottom;i++)
		{
		    for(int j=left;j<=right;j++)
		    {
		        sum += matrix[i][j];
		    }
		}
		
		System.out.println(sum);

	}
}
