package com.test;

import org.testng.annotations.Test;

public class TestNGfeatures {

	
	@Test
	public void loginPageTest()
	{
		System.out.println("Login page");
		//int i = 9/0;
	}
	@Test(dependsOnMethods="loginPageTest")
	public void HomePageTest()
	{
		System.out.println("Home page");
	}
	@Test(dependsOnMethods="loginPageTest")
	public void SearchPage()
	{
		System.out.println("Search page");
	}
	@Test(dependsOnMethods="loginPageTest")
	public void RegPage()
	{
		System.out.println("Registration page");
	}
	
	
	
}
