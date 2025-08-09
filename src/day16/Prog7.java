package day16;

import customExceptions.LoginException;
import customExceptions.SignUpException;

public class Prog7 {

	public static void main(String[] args) throws SignUpException {
		// TODO Auto-generated method stub

		try {
			int i = 2/0;
		}
		catch (Throwable e) {
           throw new SignUpException("This is my custom exception and there is some problem in sign up program please fix it "+e);
		}
	}

}
