package com.wacsy.reflection;

/**
 * 
 * @author soy
 *
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println(this.getClass().getSimpleName() + " draw()");
	}

}
