package selenium;

public class Str1 {
	public static void main(String[] args) {
		String s1=new String ("sara");
		String s11= new String ("sara");
		if(s1.equals(s11))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(s1==s11)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		StringBuffer sb= new StringBuffer("sara");
		StringBuffer sb1= new StringBuffer("sara");
		if(sb.equals(s1))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		if(sb==sb1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
