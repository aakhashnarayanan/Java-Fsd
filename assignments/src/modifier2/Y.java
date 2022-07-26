package modifier2;
import modifier1.*;
public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M objM= new M();
		objM.method1();
		objM.callM();
		N objN= new N();
		objN.method1();
		objN.callN();
		X objX=new X();
		System.out.println("class X public variable " + objX.a);
		System.out.println("class X default variable " + objX.d);
		System.out.println("class X protected variable " + objX.c);
		System.out.println("class X private variable " + objX.private2());
	}

}
