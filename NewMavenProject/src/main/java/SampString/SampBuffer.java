package SampString;

public class SampBuffer {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer();
		StringBuffer sb1=new StringBuffer("hello");
		StringBuffer sb2=new StringBuffer("hello java program");
		StringBuffer sb3=new StringBuffer("hello world");
		System.out.println(sb.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println(sb1.capacity());
		System.out.println(sb3.append("programers"));
		System.out.println(sb3.delete(5, 6));
		System.out.println(sb3.replace(6, 11, "all"));
		System.out.println(sb3.insert(5, "o "));
		System.out.println(sb3.reverse());
	}

}
