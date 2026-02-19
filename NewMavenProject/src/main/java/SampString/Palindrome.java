package SampString;

public class Palindrome {

	public static void main(String[] args) {
		int a= 123;
		System.out.println("before reversing :" + a);
		System.out.println("reversed mumber :" +a+revers(a));
		

}
 public static int revers(int n)
 {
	 int rev=0;
	 while(n>0)
	 {
		 rev=rev*10+(n%10);
		 n=n/10;
	 }
	 return rev;
 }
}
