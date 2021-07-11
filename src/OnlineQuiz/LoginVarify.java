package OnlineQuiz;

import java.io.File;
import java.util.Scanner;

public class LoginVarify  {

	private  Scanner scanner;
	

	
	public boolean loginVerify(String user_name, String password, String filepath) {
		boolean found=false;
		String trimuser_name="";
		String trimpassword="";
		
		try {
			scanner=new Scanner(new File(filepath));
			scanner.useDelimiter("[,\n]");
			
			while(scanner.hasNext() && !found)
			{
				trimuser_name=scanner.next();
				trimpassword=scanner.next();
				
				if(trimuser_name.trim().equals(user_name.trim()) && trimpassword.trim().equals(password.trim()))
				{
					return true;
				}
			}
			scanner.close();
			return false;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}

}
