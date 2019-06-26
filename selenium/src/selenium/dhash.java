package selenium;

public class dhash {
//	int i;
//	dhash(int i)
//	{
//		this.i=i;
//	}
//	public int hashCode()
//	{
//		return i;
//	}
//public static void main(String[] args) {
//	dhash d= new dhash(10);
//	dhash d1= new dhash(100);
//	System.out.println(d);
//	System.out.println(d1);
//	int i;
//	dhash(int i)
//	{
//		this.i=i;
//	}
//	public String toString()
//	{
//		return i+"";
//	}
//	public int hashCode()
//	{
//		return i;
//	}
//public static void main(String[] args) {
//	dhash d= new dhash(10);
//	dhash d1= new dhash(100);
//	System.out.println(d);
//	System.out.println(d1);
	String name;
	int roll;
	dhash(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
}
//	public boolean equals(Object obj)
//	{try {
//		String name=this.name;
//		int roll=this.roll;
//		dhash d8=(dhash)obj;
//		String name2=d8.name;
//		int roll2= d8.roll;
//		if((name.equals(name2))&& (roll==roll2))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}}
//		catch(ClassCastException cce)
//		{
//			return false;	
//		}
//	catch(NullPointerException nu)
//	{
//		return false;	
//	}
//
//	}
	////simplified
//	public boolean equals(Object obj)
//	{try {
//		dhash d8=(dhash)obj;
//		if(name.contentEquals(d8.name)&&roll==d8.roll)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	
//	}
//	catch(ClassCastException cce)
//	{
//		return false;
//	}
//	catch(NullPointerException nu)
//	{
//		return false;
//	}
//	}
	
	///more simplified
	
	public boolean equals(Object obj)
	{
		if(obj==this)
		{
		return true;}
		if(obj instanceof dhash)
		{
			dhash d8=(dhash)obj;
			if(name.equals(d8.name)&& roll==d8.roll)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		dhash d1= new dhash("ram",1);
		dhash d2= new dhash("shyam",2);
		dhash d3= new dhash("ram",1);
		dhash d4= d1;
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d3));
		System.out.println(d1.equals(d4));
		System.out.println(d1.equals("ram"));
		System.out.println(d1.equals(null));
	}
}
