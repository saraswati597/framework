package selenium;

public class LargestSubSequence {
	
	      
	  
	    public static int output(int a[], int p) 
	    { 
	       
	        int m = 1, l = 1; 
	           
	     
	        for (int i=1; i<p; i++) 
	        { 
	            
	            if (a[i] > a[i-1]) 
	                l++; 
	            else
	            { 
	               
	                if (m < l)     
	                    m = l; 
	                       
	               
	                l = 1;     
	            }     
	        } 
	           
	        
	        if (m< l) 
	            m = l;
	           
	       
	        return m; 
	    } 
	      
	    
	    public static void main(String[] args)  
	    { 
	         int a[] = {1,3,5,4,7,9,12}; 
	            int p = a.length; 
	            System.out.println( 
	            		output(a, p)); 
	          
	        } 
	    } 

