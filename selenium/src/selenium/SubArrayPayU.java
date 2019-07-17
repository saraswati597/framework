package selenium;

public class SubArrayPayU {
	
	    
	    static void changeZeros(int a[], int p) 
	    { 
	        int c = 0;  
	        for (int i = 0; i < p; i++) 
	            if (a[i] != 0) 
	                a[c++] = a[i]; 
	  
	        
	        while (c < p) 
	            a[c++] = 0; 
	    } 
	  
	   
	    public static void main (String[] args) 
	    { 
	        int a[] = {0,1,0,3,12}; 
	        int p = a.length; 
	        changeZeros(a, p); 
	        for (int i=0; i<p; i++) 
	            System.out.print(a[i]+" "); 
	    } 

}


//SELECT  email FROM person GROUP BY  emailHAVING COUNT(email) > 1