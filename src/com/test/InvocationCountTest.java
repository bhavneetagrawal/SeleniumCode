package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is=="+c);
	}
	
	
	/*@Test(invocationTimeOut=2000)
	public void InfiniteLoopTest()
	{
	int i =1;
	while(i==1)
	{
		System.out.println(i);
	}
	}*/
}
