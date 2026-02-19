package SampString;

public class StringMethod {
	public static void main(String[] args) {
		String s ="hello";
		String s1 ="      world       ";
		String s2 =" HELLO";
		String s3 =new String("java program");
		System.out.println(s.length());
		System.out.println(s1.equals(s));
		System.out.println(s.equals(s));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s3.charAt(8));
		System.out.println(s3.indexOf('p'));
		System.out.println(s2.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s3.contains("dgf"));
		System.out.println(s3.substring(0,3));
		System.out.println(s3.replace("java", "python"));
		System.out.println(s.concat(" "+s1));
		System.out.println("befor trim :" + s1);
		System.out.println("after trim :" +s1.trim());
		System.out.println(s.startsWith("h"));
		System.out.println(s1.endsWith(" "));
		String splittring[]=s3.split("a");
		for(String a: splittring)
		{
			System.out.println(a);
		}
		
		
		
		
		
	}

}
