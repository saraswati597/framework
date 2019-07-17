package selenium;

public class add {
public static void main(String[] args) {
	String s= "ABCh81ay199sd";
	

	char[] c=s.toCharArray();
	String a="";
	String b="";
	String d="";
	for(int i=0; i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			
	a=a+s.charAt(i);
		}
		if(!Character.isDigit(s.charAt(i)))
		{
			b=b+s.charAt(i);
		}
	}
	System.out.println(a);
	System.out.println(b);
	
	}
}

