package com.wacsy.reflection.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import com.wacsy.reflection.Circle;
import com.wacsy.reflection.Cookie;
import com.wacsy.reflection.Shape;
import com.wacsy.reflection.Square;
import com.wacsy.reflection.Triangle;

public class Launch {
	public static void main(String[] args) {
//		Vector<Shape> shapes = new Vector<Shape>();
//		
//		//增加形状元素
//		shapes.add(new Circle());
//		shapes.add(new Square());
//		shapes.add(new Triangle());
//		
//		//
//		Enumeration<Shape> enumeration = shapes.elements();
//		
//		while (enumeration.hasMoreElements()) {
//			Shape shape = (Shape) enumeration.nextElement();
//			shape.draw();
//		}
		
		Class<Cookie> clazz = Cookie.class;
		Constructor<?>[] constructors = clazz.getConstructors();
		Method[] methods = clazz.getMethods();
		
		for (Constructor<?> constructor : constructors) {
//			Object object = constructor;
			Constructor<Cookie> constructor_Cookie = (Constructor) constructor;
			System.out.println(constructor_Cookie);
		}
		
		for (Method method : methods) {
			System.out.println(method.toGenericString());
		}
	}
}
