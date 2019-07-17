package selenium;

public class AddString {
	public static void main(String[] args) {
		String s= "99";
		String s1=s.substring(0, s.length()-1);
		String s2="";
		String digit="";
String s3="";
		int k = 0;
		int len = 0;
		char[] c=s.toCharArray();
		char u=c[c.length-1];
		s2=s2+u;
		String m="-";
		char mi=c[c.length-2];
		String h="";
		h=h+mi;
		if(h==m)
		{
			
		}
		if(!Character.isDigit(u))
		{
			s1=s1+u+1;
			System.out.println(s1);
			
		}
		else {
			
for(int i=0;i<c.length;i++)
			{
				if(Character.isDigit(c[i]))
				{
					digit=digit+c[i];
					
				}
				if(!Character.isDigit(c[i]))
				{
					digit="";
					
				}
			}
			
k=Integer.parseInt(digit)+1;
 len=digit.length();
 s3=s.substring(0, s.length()-len);
	s3=s3+k;
	System.out.println(s3);


		}
		
		}
}
