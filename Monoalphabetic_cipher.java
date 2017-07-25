import java.util.Scanner;

public class Monoalphabetic_cipher {
	
	public static void main(String args[])
	{
		String plaintext ;
		String key = "adefjkmnpwxyqruzvstolbghic";
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Plain Text     : ");
		plaintext = s.nextLine();
		plaintext = encrypt(plaintext,key);
		System.out.println("Encrypted Text : "+plaintext);
		plaintext = decrypt(plaintext,key);
		System.out.println("Encrypted Text : "+plaintext);
		
	}

	private static String decrypt(String plaintext, String key) {
		
		String temporary = "";
		for(int i=0;i<plaintext.length();i++)
		{
			if(Character.isLowerCase(plaintext.charAt(i)))
			{
				int x = key.indexOf(plaintext.charAt(i));
				temporary = temporary + (char)(x+'a');
			}
			else if(Character.isUpperCase(plaintext.charAt(i)))
			{
				int x = key.indexOf(Character.toLowerCase(plaintext.charAt(i)));
				temporary = temporary + (char)(x+'A');
			}
			else
				temporary = temporary + plaintext.charAt(i);
			
		}
		return temporary;
	}

	private static String encrypt(String plaintext, String key) {
		
		String temporary = "";
		for(int i=0;i<plaintext.length();i++)
		{
			if(Character.isLowerCase(plaintext.charAt(i)))
			{
				int x = (int)(plaintext.charAt(i)-'a');
				temporary = temporary + key.charAt(x);
			}
			else if(Character.isUpperCase(plaintext.charAt(i)))
			{
				int x = (int)(plaintext.charAt(i)-'A');
				temporary = temporary + Character.toUpperCase(key.charAt(x));
			}
			else
				temporary = temporary + plaintext.charAt(i);
			
		}
		return temporary;
	}

}
