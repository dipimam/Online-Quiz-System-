package OnlineQuiz;

import java.io.File;

import java.util.Scanner;
import java.util.Set;



import java.util.HashSet;
import java.util.Iterator;



public class DisplayDifferentQuiz {
	
	public String displayDIfferentQuiz()
	{
		File file = new File("JavaQus.txt");  
		
		Set set= new HashSet<String>();
		
		
	
			      
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			int i=1;
			  while (sc.hasNextLine()) 
			  {
				  String display=sc.nextLine();
				  
			      set.add(display.substring(0, 6));
	}

}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Iterator itr = set.iterator();
		int i=1;
		while(itr.hasNext()){
			String value = (String) itr.next();
			System.out.println(i+"."+value);
			i++;
		}
		
		sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		Iterator forid = set.iterator();
		String value=null;
		
		for(int j=0;j<id;j++)
		{
		     	value=(String) forid.next();
		}
		
		return value;
	}
}

	

