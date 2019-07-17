package selenium;

import java.util.HashSet;
import java.util.Iterator;

public class ar1 {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,6,7};
		int[]b=new int[11];
		for(int i=0;i<b.length;i++)
		{
			b[i]=i;
		}
		HashSet hs=new HashSet();
			for(int as:a)	
			{
			hs.add(as)	;
			}
Iterator i =hs.iterator();
while(i.hasNext())
{
	System.out.print(i.next().toString()+" ");
}
System.out.println();
System.out.println("printing missing element");
for(int as1:b)	
{
if(!hs.contains(as1))	
{
	System.out.print(as1+" ");
}
}
}
}