package day7;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 3;
		
		int j =1;
		switch(i)
		{
		  case 1:
		  case 2:
		     //stmt sequence
			  System.out.println("This number is one and two");
		    break;
		  case 3:
		     //stmt sequence
			  System.out.println("This number is three");
			  switch(j)
				{
				  case 1:
					  System.out.println("This is nested switch ");
				}
		    break;
		  case 4:
			    //stmt sequence
			  System.out.println("This number is four");
			   break;
		}

		
	}

}
