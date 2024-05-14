package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String reverseString(String str) {

		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();

		return str;

	}

}
