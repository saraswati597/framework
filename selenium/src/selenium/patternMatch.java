package selenium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class patternMatch {

	public static void main(String[] args) {
		int []a= {2,3,4,1,71,72,73,74,7};
		
	int count=1;
	int temp=1;
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>a[i-1])
		{
		count++;	
		}
		else
		{
			if(temp<count)
			{
				temp=count;
				count=1;
			}
			
		}
	}
		
		if(temp<count)
		{
			temp=count;
		}
	
	System.out.println(temp);
	}
	}
	


