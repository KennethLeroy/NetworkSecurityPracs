package pracs;

import java.util.Scanner;

public class Ceasers {
	static String decrypt(String s)
	{
		String ans = new String();
		int ascii;
		int len = s.length();
		for(int i = 0; i<len;i++)
		{
			ascii=(int)s.charAt(i);
			ascii = ascii-3;
			ans = ans+(char) ascii;
		}
		return ans;	
	}
	static String decrypt(String s,int val)
	{
		String ans = new String();
		int ascii;
		int len = s.length();
		for(int i = 0; i<len;i++)
		{
			ascii=(int)s.charAt(i);
			ascii = ascii-val;
			ans = ans+(char) ascii;	
		}
		return ans;	
	}
	static String encrypt(String s)
	{
		String ans = new String();
		int ascii;
		int len = s.length();
		for(int i = 0; i<len;i++)
		{
			ascii=(int)s.charAt(i);
			ascii = ascii+3;
			ans = ans+(char) ascii;
		}
		return ans;
	}
	static String encrypt(String s,int val)
	{
		String ans = new String();
		int ascii;
		int len = s.length();
		for(int i = 0; i<len;i++)
		{
			ascii=(int)s.charAt(i);
			ascii = ascii+val;
			ans = ans+(char) ascii;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Ceasers,2 for modified Ceasers");
		int choice = sc.nextInt();
		if(choice==1)
		{
			System.out.println("Enter the plaintext");
			text=sc.next();
			System.out.println(encrypt(text));
		}
		else 
		{
			System.out.println("Enter the plaintext");
			text=sc.next();
			System.out.println("Enter places to transpose");
			int val = sc.nextInt();
			System.out.println(encrypt(text,val));
		}
		/*	
		System.out.println("Enter the ciphertext");
		text=sc.nextLine();
		System.out.println(decrypt(text));
		*/
	}

}
