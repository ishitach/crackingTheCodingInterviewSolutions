import java.util.*;
import java.io.*;


class Five{

	public static void main(String[] args){
	
		System.out.println(oneAway("pale","ple"));
		System.out.println(oneAway("pales","pale"));
		System.out.println(oneAway("pale","bale"));
		System.out.println(oneAway("pale","bake"));
			

	}

	private static boolean oneAway(String s1, String s2){

		if(s1.length() == s2.length()){
			return checkRep(s1,s2);
		}
		else if(s1.length()-1 == s2.length()){
			return checkEdit(s2,s1);
		}
                else if(s1.length() == s2.length()-1){ 
                        return checkEdit(s1,s2);
                }else{
			return false;
		}

	} 

	private static boolean checkRep(String s1, String s2){

		boolean resp=false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				if(resp){
					return false;
				}
				resp =true;
			}
		
		}
		return true;
	}

	private static boolean checkEdit(String s1, String s2){

		int i1=0,i2=0;

		while(i1<s1.length() && i2 <s2.length()){

			if(s1.charAt(i1)!=s2.charAt(i2)){
				if(i1!=i2){
					return false;
				}
				i2++;
			}else{
				i1++;
				i2++;
			}
		}
		return true;
	}

}
