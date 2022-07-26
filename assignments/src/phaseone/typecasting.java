package phaseone;

public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float flt=6.44F;
		long lg=(long) flt;
		System.out.println("Float --> long: " + lg);
		double db=100.5;
		char cr=(char) (int) (long) db;
		System.out.println("Double --> Long --> Int --> Char: " + cr);
		long lg1=47563782;
		byte bt=(byte) lg1;
		System.out.println("Long --> Byte: " + bt);
		int a=69;
		long lg2=(long) (double) a;
		System.out.println("Int --> Double --> Long: " + lg2);

	}

}
