package OnlineQuiz;

import java.util.Scanner;





public class OutLook {
  public OutLook()
  {
	  System.out.println("******Online Quiz Management System******\n \n");
  }
  
  public void loginAS()
  {
	  LogIn logIn=new LogIn();
	  System.out.println("***Login As***\n");
	  System.out.println("1.Teacher.");
	  System.out.println("2.Student.");
	  
	  Scanner scanner= new Scanner(System.in);
	  int input=scanner.nextInt();
	  if(input==1)
	  {
		  System.out.println("1.Already have an account?");
		  System.out.println("2.Create new account.");
		  int haveAccountorNot=scanner.nextInt();
		  if(haveAccountorNot==1)
		  {
			  System.out.println("Enter user name:");
			  String user_name=scanner.next();
			  System.out.println("Enter Password:");
			  String password=scanner.next();
			  LoginVarify loginVarify=new LoginVarify();
			  if(loginVarify.loginVerify(user_name, password, "teacherLogin.txt"))
			  {
				  System.out.println("Login Successful.");
				  
				  Quiz quiz=new SetQuestion();
				  
			  }
			  else {
				System.out.println("Login unsuccessful.");
				loginAS();
			}
			  
			  
		  }
		  else if(haveAccountorNot==2)
		  {
			  System.out.println("Enter user name:");
			  String user_name=scanner.next();
			  System.out.println("Enter Password:");
			  String password=scanner.next();
			  
			  logIn.teacherLogin(user_name, password);
			  loginAS();
		  }
		  
	  }
	  
	  
	  else if(input==2)
	  {
		  System.out.println("1.Already have an account?");
		  System.out.println("2.Create new account.");
		  int haveAccountorNot=scanner.nextInt();
		  if(haveAccountorNot==1)
		  {
			  System.out.println("Enter user name:");
			  String user_name=scanner.next();
			  System.out.println("Enter Password:");
			  String password=scanner.next();
			  LoginVarify loginVarify=new LoginVarify();
			  if(loginVarify.loginVerify(user_name, password, "studentLogin.txt"))
			  {
				  System.out.println("Login Successful.");

					DisplayDifferentQuiz displayDifferentQuiz=new DisplayDifferentQuiz();
					String id=displayDifferentQuiz.displayDIfferentQuiz();
					
					System.out.println(id);
					
					DisplayQuestion displayQuestion=new DisplayQuestion();
					displayQuestion.displayJavaQuestion(id, "JavaQus.txt");
				  
			  }
			  else {
				System.out.println("Login unsuccessful.");
				loginAS();
			}
		  }
		  else if(haveAccountorNot==2)
		  {
			  System.out.println("Enter user name:");
			  String user_name=scanner.next();
			  System.out.println("Enter Password:");
			  String password=scanner.next();
			  
			  logIn.studentLogin(user_name, password);
			  loginAS();
		  }
	  }
	  else {
		System.out.println("Wrong input.");
		loginAS();
		
	}
	  

  }
}
