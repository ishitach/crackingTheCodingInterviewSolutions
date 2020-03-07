import java.util.*;
import java.io.*;

class Six{

	public static void main(String[] args){

		String str="aabcccccaaa";
		System.out.println(compressStr(str));

	}

	private static String compressStr(String str){

		StringBuilder sb = new StringBuilder();
		int count =0;
		for(int i=0;i<str.length();i++){
			count++;
			if(i+1>=str.length() ||  (str.charAt(i)!= str.charAt(i+1))){
				sb.append(str.charAt(i));
				sb.append(count);
				 count=0;
			}
			
			//count=0;
		}
		System.out.println(sb.toString());
		
		if(sb.length()<str.length()){
			return sb.toString();
		}

		return str;
	}

}
