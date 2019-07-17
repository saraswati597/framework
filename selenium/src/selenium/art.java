package selenium;

public class art {
	public static void main(String[] args) {
		char[] c= new char[7];
		int u = c.length;
		c[1]='a';
		c[3]='y';
		c[5]='d';
		c[6]='x';
		c[2]='v';
		System.out.println(u);
		String h=c[0]+"";
		boolean b=h.isEmpty();
		System.out.println(b);
		System.out.println(h);
		int y=h.length();
		System.out.println(y);
	}

}
