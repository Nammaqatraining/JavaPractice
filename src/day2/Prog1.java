package day2;

public class Prog1 {
	
	int empNo = 10; //valid
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Identifiers
		
		int empNo = 10; //valid
		
		
		//int 1empNo = 10; //invalid
		
		String _empName = "ABC"; //valid
		
		String $empName = "ABC"; //valid
		
		//String *empName = "ABC"; //invalid
		
		String emp$Name = "ABC"; //valid
		
		String emp_Name = "ABC"; //valid
		
		String empName_ = "ABC"; //valid
		
		String empName$ = "ABC"; //valid
		
		String empName1 = "ABC"; //valid
		
		
		int emp_Application_Number1_$1000 = 123; //valid
		
		
		//int emp_Application Number1_$1000 = 123; //invalid
		
		
		//Using the class names
		String String = "ABC"; //valid
		String Exception = "CDE"; //valid
		
		
		String xxx = "abc123"; //not suggestible
		String accNo = "123"; //Suggestible
		
		String Empxxx_temp_adress_xxxxxxxxxxxxxxxxxx = "abc123"; //not suggestible
		String EmpTempAddress = "123"; //not Suggestible
		String Emp_Tem_Address = "123"; //Suggestible
		
		
	}

}
