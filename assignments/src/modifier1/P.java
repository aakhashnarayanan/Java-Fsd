package modifier1;
public class P {
		public void method1()
		{
			System.out.println("Class P public method");
		}
		void method2()
		{
			System.out.println("Class P default method");
		}
		private void method3()
		{
			System.out.println("Class P private method");
		}
		protected void method4()
		{
			System.out.println("Class P protected method");
		}
		public void callP()
		{
			method2();
			method3();
			method4();
		}
		public static void main(String[] args) {		
			M objM= new M();
			System.out.println("class M default variable " + objM.b);
			System.out.println("class M protected variable " + objM.c);
			System.out.println("class M private variable " + objM.private1());
			N objN= new N();
			System.out.println("class N default variable " + objN.z);
			System.out.println("class N protected variable " + objN.x);
			System.out.println("class N public variable " + objN.y);
		}
	}
