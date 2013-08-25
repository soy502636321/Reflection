package com.wacsy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SweetShop {
	public static void main(String[] args) {
		System.out.println("insidemain");
		Candy candy = new Candy();
		System.out.println("After creating Candy");
		Class<Gum> clazz = Gum.class;
		System.out.println("After Class.forName(\"Gum\")");
		Cookie cookie = new Cookie();
		System.out.println("After creating Cookie.class");
		
		
		System.out.println(Boolean.TYPE);
		System.out.println(Boolean.TYPE);
		
		System.out.println(String.class.isInstance("strin"));
//		System.out.println(String.class.newInstance());
		try {
			Constructor<String> constructor = String.class.getConstructor(String.class);
			String string = constructor.newInstance("Hello");
			
			System.out.println(string);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
