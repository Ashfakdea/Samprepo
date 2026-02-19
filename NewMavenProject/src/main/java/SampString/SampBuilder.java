package SampString;

public class SampBuilder {

	public static void main(String[] args) {


	StringBuilder sb=new StringBuilder();
	StringBuilder sb1= new StringBuilder("hello");
	StringBuilder sb2= new StringBuilder("java program");
	System.out.println(sb.capacity());
	System.out.println(sb2.length());
	System.out.println(sb2.capacity());
	System.out.println(sb1.capacity());
	System.out.println(sb2.append("programers"));
	System.out.println(sb2.delete(5, 6));
	System.out.println(sb2.replace(6, 11, "all "));
	System.out.println(sb2.insert(5, "o "));
	System.out.println(sb2.reverse());

	}

}
