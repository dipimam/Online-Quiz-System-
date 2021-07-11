package OnlineQuiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class SetQuestion extends Quiz {

	@Override
	public void setjavaqus() {
		
		File file= new File("JavaQus.txt");
		Scanner scanner=new Scanner(System.in);
		  
		 
		  try {
			  if(!file.exists())
			  {
			  file.createNewFile();
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		   System.out.print("How many question you want to set?");
		   int input=scanner.nextInt();
		   scanner.nextLine();
	
			  char i='A';
		  try {
		    	
		    	FileWriter myWriter=new FileWriter(file,true);
		    	
		    	System.out.println("Set an id for the question:");
		    	String id=scanner.nextLine();
		    	
		  	  
		     while(input>0)
		    	 {
		    	
		    	
		    	System.out.println("Write the question:");
		    	String question=scanner.nextLine();
		    	
		    	myWriter.write("\n"+id+","+i+"."+question);
		    	
		    	
		    	System.out.println("Give 4 options:");
		    	
		    	for(int j=1;j<=4;j++)
		    	{
		    		System.out.println(j+":");
		    		String option=scanner.nextLine();
		    		myWriter.write("\n"+id+","+j+"."+option);
		    	}
		    	
		    	System.out.println("What is the correct answer?");
		    	String correctanswer=scanner.nextLine();
		    	
		    	myWriter.write("\n"+id+"answer,"+i+"."+correctanswer);
		    
		    	
		    	 input--;
			     i++;
				
			}
		 	myWriter.close();
		     
		  }catch (Exception e) {
				// TODO: handle exception
			}
		  
		 
		  }
	
		
	

	@Override
	public void settocqus() {
		
	}
	
	

}
