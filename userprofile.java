package Lab1Company;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;


public class userprofile 
{
public static void main(String[]args)
    {
	Scanner input = new Scanner(System.in);
	
	String user, pass;
	
	System.out.println("enter your username: ");
	user = input.nextLine();
	
	System.out.println("enter your password: ");
	pass = input.nextLine();
	
	if(user.equals("Harshit") && pass.equals("181E@wFT"))
	{
		System.out.println("Welcome Harshit");
		
	}
	else 
	{
		System.out.println("plpease check the username and password");
	}
   
	}


public class PasswordGEnerator
{
	public static String generateRandomPassword(int len) 
	{
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"
          +"abcdefghijklmnopqrstuvwxyz"+ "!@#$%&~<>?"; 
		Random rndpwd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rndpwd.nextInt(chars.length())));
		return sb.toString();
    }
	
	
	public static String generateRandomEmail(int length) 
	{
	    log.info("Generating a Random email String");
	    String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.@$?";
	    String email = "";
	    String temp = RandomStringUtils.random(length, allowedChars);
	    email = temp.substring(0, temp.length() - 9) + "@testdata.com";
	    return email;
	}
	
}
}
