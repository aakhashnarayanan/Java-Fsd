package string2;

public class student {
	int s1,s2,s3;
	String name;
	int age;
	char section;
	char gender;

	int total;
	double percent;
	public student(){s1=0;}
	public student(String name,int age,char section,char gender,int s1,int s2,int s3){
		this.age=age;
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	public student(String name,int age,char section,char gender,int s2,int s3)
	{
		this.age=age;
		this.name=name;
		this.section=section;
		this.gender=gender;
		this.s2=s2;
		this.s3=s3;
	}
	public int total()
	{
		total=this.s1+this.s2+this.s3;
		return total;
	}
	public double percent(){
		percent=(total/3);
		return percent;
	}
	public void display()
	{
		System.out.println("Student details:"+this. name+" "+this.age+" "+this.section+" "+this.gender);
		System.out.println("total marks:"+total());
		System.out.println("percentage:"+percent());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student ob1=new student("aaa",20,'A','M',80,80,90);
		student ob2=new student("bbb",19,'D','F',90,80);
		student ob3=new student("ccc",19,'C','F',80,80,90);
		student ob4=new student("ddd",19,'B','M',80,80);

		ob1.display();
		ob2.display();
		ob3.display();
		ob4.display();

	}

}
