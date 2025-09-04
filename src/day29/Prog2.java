package day29;

public class Prog2 {

	Day day;
	
	public Prog2(Day day) {
		// TODO Auto-generated constructor stub
		this.day = day;
	}
	
	public void dayIsLike() {
		switch(day) {
		case MONDAY: {
			System.out.println("Monday's are bad");
			break;
		}
		case TUESDAY: {
			System.out.println("Tuesday are better");
			break;
		}
		case WEDNESDAY: {
			System.out.println("WEDNESDAY is fine");
			break;
		}
		case THURSDAY: {
			System.out.println("THURSDAY is OK");
			break;
		}
		case FRIDAY: {
			System.out.println("FRIDAY is very good");
			break;
		}
		case SATURDAY: 
		case SUNDAY:	
		{
			System.out.println("Weekends are very good");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog2 obj = new Prog2(Day.valueOf("SATURDAY"));
		obj.dayIsLike();
	}

}
