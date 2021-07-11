package OnlineQuiz;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class varifyAnswer extends DisplayQuestion{
	
	public int varifyanswer(String id,char character)
	{
		
		Scanner scanner=new Scanner(System.in);
		File file = new File("JavaQus.txt");  
		
		System.out.println("Input your answer:");
		String answer=scanner.nextLine();
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			
			
			
			  while (sc.hasNextLine()) 
			  {
				  String display=sc.nextLine();

				  
				  if(display.equals(id+"answer,"+character+"."+answer))
				  {
					  System.out.println("Correct answer.");
					  return 1;
			  }
				  
				
	}

} catch (Exception e) {
	// TODO: handle exception
}
		
		return 0;
		
		
		
	}

}
