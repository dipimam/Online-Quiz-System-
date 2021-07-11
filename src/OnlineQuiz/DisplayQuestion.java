package OnlineQuiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DisplayQuestion {
	

   
	
	public void displayJavaQuestion(String id, String filepath)
	{
		File file = 
			      new File(filepath);  
		int score=0;
		int noqus=0;
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			int i=1;
			char questionno='A';
			
			  while (sc.hasNextLine()) 
			  {
				  String display=sc.nextLine();
				  
			      if(display.contains(id) && i%6!=0)
			      {
			    	
			    		  System.out.println(display.substring(7));
					
			      }
			      if(i%6==0 && display.contains(id))
			      {
			    	  noqus++;
			    	  varifyAnswer object=new varifyAnswer();
			    	  
			    	  int ans=object.varifyanswer(id,questionno);
			    	  score+=ans;
			    	  questionno++;
			      }
			      i++;
			  }
			 
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("You have Got "+score+" out of "+noqus);
		System.out.println("\n      Thank You \n\n\n\n");
		  
	  
	  } 
		
	}

