import java.util.*;
import java.io.*;

class Eight{

	public static void main(String[] args){

		int a[][] = { { 1, 0, 0, 1 }, 
                      { 0, 0, 1, 0 }, 
                      { 0, 0, 0, 0 } }; 



		boolean row=false;
		boolean col = false;

		 for(int i=0;i<a.length;i++){ 

                        for(int j=0;j<a[0].length;j++){
		
				if(i==0 && a[i][j]==1) row = true; 
				if(j==0 && a[i][j]==1) col = true;

				if(a[i][j]==1){
					a[i][0]=1;
					a[0][j]=1;
				}
			}
		}

		 for(int i=1;i<a.length;i++){

                        for(int j=1;j<a[0].length;j++){
				if(a[i][0] ==1 || a[0][j]==1){
					a[i][j]=1;
				}
			}

		}		


		if(col){

			for(int i=0;i<a.length;i++){
				a[i][0]=1;
			}
		}

	
                if(row){

                        for(int j=0;j<a[0].length;j++){
                                a[0][j]=1;        
                        }
                }

		for(int i=0;i<a.length;i++){

			for(int j=0;j<a[0].length;j++){

				System.out.print(a[i][j]+" ");
			}
			System.out.println();
	
		}

	}

}
