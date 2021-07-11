package OnlineQuiz;

import java.util.Scanner;

public abstract class Quiz {
	
	Scanner scanner=new Scanner(System.in);
	
	public Quiz()
	{
		System.out.println("Set question:\n");
		System.out.println("1.Java");
		System.out.println("2.TOC");
		int input=scanner.nextInt();
		
		if(input==1)
		{
			setjavaqus();
		}

	}
	
	public abstract void setjavaqus();
	public abstract void settocqus();

}
