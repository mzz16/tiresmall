package com.tireshoppingmall.home.auth;

public class LoginSocialType {
	public static boolean checkType(String s) {
		System.out.println("시작");
		System.out.println(s);

		//ID의 끝자리 문자가 'N'
		if (s.charAt(s.length()-1)=='N') {
			System.out.println("체크성공");
			return true;
		}
		return false;
	}
}
