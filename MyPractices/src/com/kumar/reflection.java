package com.kumar;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class reflection {

		
	public static void main(String[] args) {
		// 3 ways of Creating object of class "Class"
	
		
		//1 - By using Class.forname() method 
		try {
			Class c1 = Class.forName("com.kumar.reflection");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//2- By using getClass() method 
		reflection bs = new reflection();
		Class c2 = bs.getClass();
		
		//3- By using .class 
		Class c3 = reflection.class;
		
		
		Class<BaseClass> c4 = BaseClass.class;
		
		System.out.println("Name -- "+c4.getName());
		int modi = c4.getModifiers();
		System.out.println("Modifier -- "+ Modifier.toString(modi));
		
		Field[] fields = c4.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("fields- "+field);
		}
		
		Class[] c5= c4.getInterfaces();
		for (Class cls:c5)
		{
			System.out.println(cls);
		}
		
	}

}
