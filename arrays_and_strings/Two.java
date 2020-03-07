import java.util.*;

class Two{

	public static void main(String[] args){

		String s1= "ishita";
		String s2 = "shit";
		String s3 = "aihits";

		System.out.println(sort(s1).equals(sort(s2)));
		System.out.println(sort(s1).equals(sort(s3)));
	}
	
	private static String sort(String str){

		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}

}
