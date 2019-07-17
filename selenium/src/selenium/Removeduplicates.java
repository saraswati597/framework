package selenium;

public class Removeduplicates {
public static void main(String[] args) {
	String s="raamissgooodbooyy";
	String s1="";
	char[]c=s.toCharArray();
	int j;
	for(int i=0;i<c.length;i++)
	{
		j=i+1;
		if(j>=i &&j<c.length)
		{
			if(c[i]!=c[j]||j==c.length-1)
			{
				
				s1=s1+c[i];
			}
		}
	}
	System.out.println(s1);
}
}
