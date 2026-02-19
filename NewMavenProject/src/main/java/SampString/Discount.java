package SampString;

public class Discount {
	public static float dis(int a,int b )
	{
		float r=a+b;
	System.out.println("total amount is :"+r);
	return r;
	
	}
	public static void discount(float nn)
	{
	if (nn<=5000)
	{
		System.out.println("Eligable for 20% discount");
		
	}
	else {
		System.out.println("total amount is :" + nn);
	}
	}
	public static void main (String arg[])
	{
	Discount d=new Discount();
	float nn=d.dis(866,976);
	//System.out.println(nn);
	d.discount(nn);
	}
}
