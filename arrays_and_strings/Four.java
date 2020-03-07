import java.util.*;
import java.io.*;

class Four{

	public static void main(String[] args){

		String str="Tact Coa";
		System.out.println(checkPalin(str));
	}

	private static boolean checkPalin(String str){
		String lower = str.toLowerCase();
		String sub = lower.replaceAll("\\s","");
		System.out.println(sub);
		char[] arr = sub.toCharArray();
		System.out.println(new String(arr));

		int odd=0;
		int[] temp = new int[26];
		for(int i=0;i<arr.length;i++){
			int val = arr[i]-'a';
			temp[val]++;
			if(temp[val]%2==0){
				odd --;
			}	
			else{
				odd++;
			}
	
		}
		return odd<2;

	}


}
