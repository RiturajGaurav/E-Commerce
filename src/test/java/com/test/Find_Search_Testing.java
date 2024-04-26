package com.test;

import com.click.Find_Every_Search;

public class Find_Search_Testing {

	public static void main(String[] args) {
		Find_Every_Search fes = new Find_Every_Search();
		fes.Setup();
		fes.OpenURL("http://www.google.com");
		fes.Search("Java");
		fes.getResults();
		fes.tearDown();
	}

}
