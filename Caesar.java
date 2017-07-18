
import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the string to secured : ");
		char str[] = s.nextLine().toCharArray();
		
		System.out.print("Enter ceaser cipher key value : ");
		int k = s.nextInt();
		
		for(int i=0;i<str.length;i++)
		{
			if(Character.isLowerCase(str[i]))
				str[i]=(char)(((str[i]+k-97)%26)+97);
			else if(Character.isUpperCase(str[i]))
				str[i]=(char)(((str[i]+k-65)%26)+65);
		}
		
		
		System.out.println("Encrypted : "+new String(str));
		
		for(int i=0;i<str.length;i++)
		{
			if(Character.isLowerCase(str[i]))
				str[i]=(char)(((str[i]+26-k-97)%26)+97);
			else if(Character.isUpperCase(str[i]))
				str[i]=(char)(((str[i]+26-k-65)%26)+65);
		}
		
		System.out.println("Decrypted : "+new String(str));
		
	}

}
