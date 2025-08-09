package day16;

import customExceptions.LoginException;

public class Prog6 {

	public static void main(String[] args) throws LoginException {
		// TODO Auto-generated method stub

		try {
			int[] arr1 = new int[-2];
		}
		catch (Throwable e) {
           throw new LoginException("This is my custom exception and there is some problem in login program fix it");
		}
	}

}
