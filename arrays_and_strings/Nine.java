import java.util.*;
import java.io.*;

class Nine{

	public static void main(String[] args){
	
		String s1="waterbottle";
		String s2 ="erbottlewat";

		boolean x = checkRot(s1,s2);
		System.out.println(x);

		

	}

	private static boolean checkRot(String s1, String s2){

		String s3 = s1+s1;
		return (s3.indexOf(s2))!=-1;

	}

}
