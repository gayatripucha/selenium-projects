package com.vmware.admin;

public class DemoClass implements DemoInterface
{
	int a=10;
	float f=10.00f;
	
	public void m1()
	{
		System.out.println("Hi iam m1 method");
	}
	
	public void m2()
	{
		System.out.println("Hi iam m2 method");
	}

	@Override
	public void m3() 
	{
		System.out.println("Hi iam implemented m3 method in parent class");
	}

	@Override
	public void m4() 
	{
		System.out.println("Hi iam implemented m4 method in parent class");
		
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("hi");
		System.out.println("hello");
		
		
		
		
		DemoClass d1=new DemoClass();
		System.out.println(d1.a);
		System.out.println(d1.f);
		
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();		
	}

	

}
