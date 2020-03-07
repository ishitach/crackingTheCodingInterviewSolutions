// algorithm to determine if a string has all unique characters

import java.util.*;
import java.io.*;

class One{

	public static void main(String[] args){

		String str = "ishitach";
		String str1 = "renu";

		System.out.println(checkUnique(str));
		System.out.println(checkUnique(str1));
	}


	private static boolean checkUnique(String str){
		
		boolean[] a=new boolean[128];
		for(int i=0;i<str.length();i++){
			int temp = str.charAt(i) - 'a';
			if(a[temp]){
				return false;
			}
			a[temp]=true; 

		}
		return true;
	}

}
