import java.util.*;
import java.io.*;

class Seven{

	public static void main(String[] args){

		int arr[][] = { { 1, 2, 3, 4 }, 
                      { 5, 6, 7, 8 }, 
                      { 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16 } }; 
		rotate(arr);
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr.length;j++){

			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


	private static void rotate(int[][] a){


		int n = a.length;
		for(int i=0;i<a.length/2;i++){ 
		
			for(int j=i;j<a.length-i-1;j++){ 
				
				int temp = a[i][j];	
				a[i][j] = a[n-j-1][i];
				a[n-j-1][i] = a[n-i-1][n-1-j];
				a[n-i-1][n-1-j] = a[j][n-1-i];
				a[j][n-1-i] = temp;
			}
		}
	}
}
