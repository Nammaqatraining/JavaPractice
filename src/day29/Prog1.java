package day29;

public class Prog1 {

	
	enum Level
	{
		LOW,
		MEDIUM,
		HIGH
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println(Level.MEDIUM);
		System.out.println(Level.HIGH);
		System.out.println(Level.LOW);*/
		
		for(Level var: Level.values()) {
			System.out.println(var);
		}
		
		
		switch (Level.MEDIUM) {
		case LOW: {
			System.out.println("Fan is in low level");
			break;
		}
		case HIGH: {
			System.out.println("Fan is in High level");
			break;
		}
		case MEDIUM: {
			System.out.println("Fan is in Medium level");
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		
	}

}
