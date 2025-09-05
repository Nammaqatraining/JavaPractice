package day30;

public class Prog6 {

	int i;
	int j;
	public Prog6(int i, int j) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
	}
	
	@Override
	public int hashCode() {
		return i+j;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prog6 obj = new Prog6(10, 20);
		System.out.println(obj.hashCode());
		
	}

}
