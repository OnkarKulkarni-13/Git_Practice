package com.practice;

public class Parent {

	String eye;
	String nose;

	public String color;
	protected String hands;

	public Parent() {
		super();
		System.out.println("Parent Class Constructor..!!");
		this.eye = "blue";
		this.nose = "long";
		this.color = "fair";
		this.hands = "2";

	}

	public Parent(String eye, String nose, String color, String hands) {
		super();
		this.eye = eye;
		this.nose = nose;
		this.color = color;
		this.hands = hands;
	}

}
