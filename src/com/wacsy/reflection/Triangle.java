package com.wacsy.reflection;

public class Triangle implements Shape {

	@Override
	public void draw() {
		System.out.println(this.getClass().getSimpleName() + " draw()");
	}

}
