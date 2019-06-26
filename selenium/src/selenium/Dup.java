package selenium;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Dup {
	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		Set<String>s= new LinkedHashSet<String>();
		l.add("vipu");
		l.add("Sara");
		l.add("vipu");
		l.add("Vivi");
		System.out.println(l);
		s.addAll(l);
		l.clear();
		l.addAll(s);
		System.out.println(l);
	}

}
