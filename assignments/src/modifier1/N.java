package modifier1;

public class N {
	protected long x=4567;
	public int y=98;
	double z=455.87666;
	public void method1()
	{
		System.out.println("Class N public method");
	}
	void method2()
	{
		System.out.println("Class N default method");
	}
	private void method3()
	{
		System.out.println("Class N private method");
	}
	protected void method4()
	{
		System.out.println("Class N protected method");
	}
	public void callN()
	{
		method2();
		method3();
		method4();
	}

}
