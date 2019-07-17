package selenium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Middle {
public static void main(String[] args) {
	LinkedList l= new LinkedList();
	l.add("one");
	l.add("two");
	l.add("three");
	l.add("four");
	l.add("five");
	l.add("six");
	int len = l.size();
	
		len=len/2;
	
	
	
	Object k = l.get(len);
	System.out.println(k);
	
}
}