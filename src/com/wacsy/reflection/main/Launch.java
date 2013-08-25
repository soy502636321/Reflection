package com.wacsy.reflection.main;

import java.util.Enumeration;
import java.util.Vector;

import com.wacsy.reflection.Circle;
import com.wacsy.reflection.Shape;
import com.wacsy.reflection.Square;
import com.wacsy.reflection.Triangle;

public class Launch {
	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		
		//增加形状元素
		shapes.add(new Circle());
		shapes.add(new Square());
		shapes.add(new Triangle());
		
		//
		Enumeration<Shape> enumeration = shapes.elements();
		
		while (enumeration.hasMoreElements()) {
			Shape shape = (Shape) enumeration.nextElement();
			shape.draw();
		}
	}
}
