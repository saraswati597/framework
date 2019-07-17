package selenium;

public class Zero {
	static void changeposition(int a[], int p) { 
	      
	 
	    int count = 0; 
	    int temp; 
	  
	    
	    for (int i = 0; i < p; i++) { 
	    if ((a[i] != 0)) { 
	        temp = a[count]; 
	        a[count] = a[i]; 
	        a[i] = temp; 
	        count = count + 1; 
	    } 
	    } 
	} 
	  

	
	public static void main(String args[]) { 
	    int a[] = {3,0,3,0}; 
	    int p = a.length; 
	  
	    
	  
	    changeposition(a, p); 
	    for (int i = 0; i < p; i++) 
	    {
		    System.out.print(a[i] + " "); 
		} 


	} 

}
