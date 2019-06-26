package selenium;

public class Rev1 {
//	String s;
//	int i;
	double d;
	Rev1(double d)
	{
//		this.s=s;
//		this.i=i;
		this.d=d;
	}
	public String toString()
	{
		String h="";
		h=h+d;
		return h;
	}
public static void main(String[] args) {
	Rev1 r=new Rev1(10.1);
	System.out.println(r);
}
}
