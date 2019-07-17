package selenium;



public class ethod {
	public static void main(String[] args) {
		String s="Ram!is@Good#";
		String f="";
		String specialCharacters=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
		char[]ch=s.toCharArray();
		String h="";
		char[]n=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			
if(!Character.isAlphabetic(ch[i])||Character.isDigit(ch[i]))
{
	n[i]=ch[i];
}
		}
		
		int j=n.length-1;
		for(int i=0; i<ch.length;i++)
			if(Character.isAlphabetic(ch[i])||Character.isDigit(ch[i])){
		{
			if(!Character.isAlphabetic(n[j])|| Character.isDigit(n[j]))
			
			{
				f=n[j]+"";
			
				 if (specialCharacters.contains(f))
				    {
					
					 f="";
					 j--;
			}
			}
			n[j]=ch[i];
			j--;
		}}
		for(int i=0; i<ch.length;i++)
		{
			
			System.out.print(ch[i]);
		}
		System.out.println();
		for(int i=0; i<n.length;i++)
		{
			
			System.out.print(n[i]);
		}
	}

}
