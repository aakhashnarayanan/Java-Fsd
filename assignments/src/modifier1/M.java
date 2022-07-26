package modifier1;

public class M {
	private int a=19;
	long b=76;
	protected float c=56.87F;
	public int private1()
	{
		return a;
	}
	public void method1()
	{
		System.out.println("Class M public method");
	}
	void method2()
	{
		System.out.println("Class M default method");
	}
	private void method3()
	{
		System.out.println("Class M private method");
	}
	protected void method4()
	{
		System.out.println("Class M protected method");
	}
	public void callM()
	{
		method2();
		method3();
		method4();
	}

}
