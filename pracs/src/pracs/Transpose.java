package pracs;
import java.util.Scanner;

public class Transpose {
	static void encrypt(int row,int col, String plainText) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plainText = new String();
		int row,col;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter plaintext");	
		plainText = sc.next();
		boolean ok = true;
		do {
			ok = true;
			System.out.println("enter number of rows");
			row = sc.nextInt();
			System.out.println("enter number of collumns");
			col = sc.nextInt();
			if(col*row<plainText.length())
			{
				ok = false;
				System.out.println("Matrix too small..retry");
			}
		}while(ok == false);
		
		char matrix[][]= new char[row][col];
		char newMatrix[][]= new char[row][col];

		int stringPos= 0;
		
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				if(stringPos<plainText.length()) 
				{
					matrix[i][j]= (char)plainText.charAt(stringPos);

				}
				stringPos++;
			}
			
		}
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[i][j]);
			}
		}
		
		int order[] = new int [col];
		for(int i=0;i<col;i++) {
		 System.out.println("Enter the column order");
		 order[i] = sc.nextInt()-1;
		}
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; i++) {
				System.out.print(matrix[order[i]][j]);//this isnt right
			}
	
		}
		//output
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < row; j++) {
				System.out.print(matrix[i][j]);
			}
		}
	}
}
