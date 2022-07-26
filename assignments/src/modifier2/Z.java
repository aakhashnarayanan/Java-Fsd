package modifier2;
import modifier1.*;
public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X objX=new X();
		System.out.println("class X public variable " + objX.a);
		System.out.println("class X default variable " + objX.d);
		System.out.println("class X protected variable " + objX.c);
		System.out.println("class X private variable " + objX.private2());
		M objM= new M();
		objM.method1();
		objM.callM();
		N objN= new N();
		objN.method1();
		objN.callN();
		P objP= new P();
		objP.method1();
		objP.callP();

	}

}
