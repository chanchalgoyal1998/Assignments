package com.yash.injectnamestobean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yash.injectNnumberstobean.ConfigurationClass;

public class MainClass {

	public static void main(String[] args) {
		String[] names = new String[5];
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);

		NameClass nameClass = (NameClass) context.getBean(NameClass.class);
		//System.out.println(nameClass);
		names[0] = nameClass.getName1().toLowerCase();
		names[1] = nameClass.getName2().toLowerCase();
		names[2] = nameClass.getName3().toLowerCase();
		names[3] = nameClass.getName4().toLowerCase();
		names[4] = nameClass.getName5().toLowerCase();
		for (String name : names) {
			for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i) != 'a' || name.charAt(i) != 'e' || name.charAt(i) != 'i' || name.charAt(i) != 'o'
						|| name.charAt(i) != 'u') {
					System.out.println("string does not contain vowel"+name);
				
				} 
			}
		}

	}

}
