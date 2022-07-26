package areaofshape;

public class shape {
		int a,b,c,r,h;
		double d;
		shape()
		{
			r=5;
			h=2;
		}
		shape(int a)
		{
			this.a=a;
		}
		shape(int b, int c)
		{
			this.b=b;
			this.c=c;
		}
		shape(double d)
		{
			this.d=d;
		}
		void display_Square()
		{
			System.out.println("Area of Square= " + a*a);
		}
		void display_Rectangle()
		{
			System.out.println("Area of Rectangle= " + b*c);
		}
		void display_Circle()
		{
			System.out.println("Area of Circle= " + 3.14*d*d);
		}
		public void area()
		{
			System.out.println("Area of Rhombus= " + r*r);
		}
		public void area(int b)
		{
			System.out.println("Area of Triangle= " + 0.5*b*h);
		}

	public static void main(String[] args) {
		shape sq=new shape(4);
		sq.display_Square();
		shape rect=new shape(4,4);
		rect.display_Rectangle();
		shape circle=new shape(4.4);
		circle.display_Circle();
		shape rh=new shape();
		rh.area();
		shape tri=new shape();
		tri.area(4);
}
}
