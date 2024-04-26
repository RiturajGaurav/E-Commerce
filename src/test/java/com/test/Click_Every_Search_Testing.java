package com.test;

import com.click.Click_Every_Search;

public class Click_Every_Search_Testing 
{

	public static void main(String[] args) 
	{
		Click_Every_Search ces = new Click_Every_Search();
		ces.Setup();
		ces.OpenURL("http://www.google.com");
		ces.Search("Java");
		ces.getResult();
		ces.tearDown();
	}

}
