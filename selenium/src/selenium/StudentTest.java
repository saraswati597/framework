package selenium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		HashMap<Student,Integer>hm=new LinkedHashMap<Student,Integer>();
		Student s1= new Student(1, "ram");
		Student s2= new Student(1, "ram");
		Student s3=new Student(1, "ram");
		

		hm.put(s1, 1);
		hm.put(s2, 2);
		

		hm.put(s3, 3);
		
		System.out.println(hm.size());

			Set<Entry<Student, Integer>> e = hm.entrySet();
		Iterator<Entry<Student, Integer>> it = e.iterator();
		while(it.hasNext())
		{
		Entry<Student, Integer> n = it.next();
			Student ke = n.getKey();
		
			String name1 = ke.name;
			int roll8 = ke.roll;
          System.out.println(" name is "+name1+"  "+" roll is "+roll8+"  value is  "+ n.getValue());
			
				
			}
			
		}
	}


