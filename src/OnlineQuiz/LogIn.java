package OnlineQuiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public  class LogIn {

  public void teacherLogin(String user_name, String password)
  {
	   File file= new File("teacherLogin.txt");
	  
	 
		  try {
			  if(!file.exists())
			  {
			  file.createNewFile();
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
  
    try {
    	
    	FileWriter myWriter=new FileWriter(file,true);
    	myWriter.write(user_name+","+password+"\n");
    	myWriter.close();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
  
  
  }
  
  
  public void studentLogin(String user_name, String password)
  {
	   File file= new File("studentLogin.txt");
	  
	 
		  try {
			  if(!file.exists())
			  {
			  file.createNewFile();
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
  
    try {
    	
    	FileWriter myWriter=new FileWriter(file,true);
    	myWriter.write(user_name+","+password+"\n");
    	myWriter.close();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
  
  
  }
  
 // public abstract boolean loginVerify(String user_name, String password, String filepath);
}

