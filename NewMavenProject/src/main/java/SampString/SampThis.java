package SampString;

public class SampThis {
	SampThis(int id,String name,float salary)
	{
	this();
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	SampThis() {
	    System.out.println("Default constructor");
	}

    

String name;
int id;
float salary;
	
	
	
	void displayInfo()
	{
		this.show();
		System.out.println("Employee name is :"+name);
		System.out.println("Employee id is :"+id);
		System.out.println("Employee salary is :"+salary);
	}
   void show()
   {
	   this.show2(10);
	   System.out.println("this is shows method");
   }
   void show2(int a)
   {
	   System.out.println(a);
   }
   
   public static void main(String args[])
   {
	   SampThis s=new SampThis(22,"jj",234);
	   s.displayInfo();
   }
   }

