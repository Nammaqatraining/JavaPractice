package day28;

public class Result extends Student implements Exam{

	
	
	public Result(String name, int m1, int m2, int m3) {
		super(name, m1, m2, m3);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void percentage() {
		// TODO Auto-generated method stub
		int total = m1+m2+m3;
		int percentage = (total*100)/300;
		System.out.println("Persentage of student "+name+" is "+percentage);
	}
	
	public static void main(String[] args) {
		Result obj = new Result("ABC", 99, 80, 100);
		obj.display();
		obj.percentage();
		
		
		Result obj1 = new Result("CDE", 100, 99, 100);
		obj1.display();
		obj1.percentage();
	}

	
}
