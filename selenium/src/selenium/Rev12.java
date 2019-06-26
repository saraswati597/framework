package selenium;

public class Rev12 {
public static void main(String[] args) {
	String s="i love my india";
	char[] c = s.toCharArray();
	char[]space=new char[c.length];
	for(int i=0;i<c.length;i++)
	{
		if(c[i]==' ')
		{
			space[i]=' ';
			}
	}
	int j=space.length-1;
	
	for(int i=0;i<c.length;i++)
	{
		if(!(c[i]==' '))
		{
			if(space[j]==' ')
			{
				j--;
			}
			
			space[j]=c[i];
			j--;
		}
		
	}
	System.out.println(String.valueOf(space));
}
}
