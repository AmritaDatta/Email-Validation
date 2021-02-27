package emailvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {
        //By using BufferReader with InputStreamReader:
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String email = br.readLine();
 
	// By using Scanner class:
	System.out.println("Entered email id : ");
        Scanner scanner = new Scanner(System.in);
	String email = scanner.nextLine();
 
	boolean result = isValidEmail(email);
        
	if (result) {
            System.out.println(email + " is valid email address.");
	} 
        else {          
            System.out.println(email + " is not a valid email address.");
	}
}  
    public static boolean isValidEmail(String email) {
	String s = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	Pattern emailPattern = Pattern.compile(s);
	Matcher m = emailPattern.matcher(email);
	return m.matches();
	}
}