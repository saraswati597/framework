package selenium;

public class Ar45 {
	public static void main(String[] args) {
		int[]ar= {2,3,5,2,2,8,0,4,7,1,6,2};
		int sum=8;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				for(int k=j+1;k<ar.length;k++)
				{
					if(ar[i]+ar[j]==sum)
					{
						System.out.println(ar[i]+"  "+ar[j]);
					}
					if(ar[i]+ar[j]+ar[k]==sum)
					{
						System.out.println(ar[i]+"  "+ar[j]+" "+ar[k]);
					}
				}
			}
		}
	}

}
