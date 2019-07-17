package selenium;

public class DynamicProgram {
	public static void main(String[] args) {
		int[]a={1,5,4,3,2};
		int sum=6;
		int l=a.length-1;
		int dif,temp1,temp2,temp3;
		for(int i=0;i<=l;i++)
		{
			if(a[i]==sum)
			{
				System.out.println(a[i]+" is subset and index is ");
			}
			if(a[i]>sum)
			{
				i++;
			}
			if(a[i]<sum)
			{
				dif=sum-a[i];
						for(int j=i+1;j<=l;j++)
						{
							if(dif==a[j])
							{
								System.out.println(a[i]+" " + a[j]+"  ");
								j++;
							}
							
								}
							}
						}
		for(int i=0;i<=l;i++)
		{
			
			if(a[i]<sum)
			{
				dif=sum-a[i];
						for(int j=i+1;j<=l;j++)
						{
							int k=j+1;
							if(dif>a[j])
							{
								
							
							temp1=a[j]+a[k];
							
							if(dif==temp1)
							{
								System.out.println(a[i]+" " + a[j]+"  "+a[k]);
								
							}}
								}
							}
						}
			}
		}
	


