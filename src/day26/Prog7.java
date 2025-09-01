package day26;

public class Prog7 extends Prog6{

	String name;
	int yearOfExp;
	
	public Prog7(String name, int yearOfExp) {
		// TODO Auto-generated constructor stub
		//super();
		this.name = name;
		this.yearOfExp = yearOfExp;
	}

	@Override
	void gridView() {
		// TODO Auto-generated method stub
		System.out.println("The name is "+name);
		System.out.println("The year of exp "+yearOfExp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prog7 obj = new Prog7("ABC", 1);
		obj.gridView();

		Prog7 obj1 = new Prog7("CDE", 2);
		obj1.gridView();
	}
}
