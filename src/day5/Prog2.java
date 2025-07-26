package day5;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 10;
		byte b = (byte) i; //-128 to 127
		System.out.println(b);
		
		
		int i1 = 128;
		byte b1 = (byte) i1;
		System.out.println(b1);
		
		//0,1,2...127,-128..0,1,2..127
		
		int i2 = 256;
		byte b2 = (byte) i2;
		System.out.println(b2);
		
		
		int i3 = 300;
		byte b3 = (byte) i3;
		System.out.println(b3);
		
		
		//-32768 to 32767
		//0,1,2...32767,-32768......0,1,2...32767...
		int i4 = 32768;
		short s1 = (short) i4;
		System.out.println(s1);
	}

}
