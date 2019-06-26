package selenium;

public class Student {
	int roll;
	String name;
	
	public Student(int roll, String name) {
		this.roll=roll;
		this.name=name;
		
	}

	

	

//	public int hashCode()
//	{
//		int hashs=0;
//		hashs=hashs+name.hashCode();
//		hashs=hashs+roll;
//		return hashs;
//	}
//
//	public boolean equals(Object obj)
//	{
//		if(this==obj)
//		{
//			return true;
//		}
//		if (obj instanceof Student)
//		{
//			Student s9=(Student)obj;
//			if(name.equals(s9.name)&& roll==s9.roll)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}
//		return false;
//	}

}
