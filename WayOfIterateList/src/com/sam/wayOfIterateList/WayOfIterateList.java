package com.sam.wayOfIterateList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WayOfIterateList {
	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");

		// 1. using for each loop
		System.out.println("1.using for each loop");
		for (String obj : strList) {
			System.out.println(obj);
		}

		// 2. usig iterator
		System.out.println("2.usig iterator");
		Iterator<String> itr = strList.iterator();
		while (itr.hasNext()) {
			String obj = itr.next(); // Or System.out.println(itr.next());
			System.out.println(obj);
		}

		// 3. using for loop
		System.out.println("3.using for loop");
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}

		// 4. using while loop
		System.out.println("4.using while loop");
		int i = 0;
		while (i < strList.size()) {
			System.out.println(strList.get(i));
			i++;
		}

		// 5. java8 onwords: stream() util.
		System.out.println("5.java8 onwords: stream() util.");
		strList.forEach((obj) -> {
			System.out.println(obj);
		});

	}
}