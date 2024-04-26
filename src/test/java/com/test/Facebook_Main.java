package com.test;

import com.facebook.Facebook;

public class Facebook_Main {

	public static void main(String[] args) {

		Facebook fb = new Facebook();
		fb.Setup();
		fb.openURL("https://www.facebook.com");
		fb.login("luckykumar.5555@gmail.com", "Pari@8982");
		String errmsg = fb.getErrormessage();
		if (errmsg.contains("The Password you have Entered is Incorrect")) {
			System.out.println("Passed: for Invalid login error message is matching");
		} else {
			System.out.println("Failed: For Invlid login error message is not as expected");
		}
	}
}
