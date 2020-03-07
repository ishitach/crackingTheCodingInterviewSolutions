import java.io.*;
import java.util.*;
class Three{

	public static void main(String[] args){


		String str = "My name is  Ishi  ";
		int sc = 0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== ' '){
				sc++;
			}

		}

		int total = str.length()+ sc*2;
		char[] resp= new char[total];
		total--;
		
		for(int i=str.length()-1;i>=0;i--,total--){

			if(str.charAt(i)==' '){
				
			resp[total] = '0';resp[total-1] = '2';resp[total-2] = '%';
			total = total-2;
			
			}else{
				resp[total] = str.charAt(i);
			}

		}

//		for(int i=0;i<respaa
		System.out.println(new String(resp));

	}


}
