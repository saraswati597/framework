package selenium;

public class anagram {
	static String s1="geeks";
	static char[]c1=s1.toCharArray();
	static String s2="keegse";
	static int count=0;
	static int prev = 0;
	static int next = 0;
	static char[]c2=s2.toCharArray();
	public static void main(String[] args) {
		
		boolean result = anagram.check();
		System.out.println(result);
		}
		
		public static boolean check()
		{
			if(c1.length!=c2.length)
			{
				return false;
			}
			
			else
			{
				for(int i=0; i<s1.length();i++)
				{
					if(c1[i]!=c2[i])
					{
						count++;
						prev=next;
						next=i;
					}
				}
			if(count==2)
			{
	return true;
			}
			return false;
			}
			
		}
	

}
