/**
 * 
 */
package com.mahesh.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author MAHI
 *
 */
public class SortElementsUsingLambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(0);
		arrayList.add(20);
		arrayList.add(14);
		arrayList.add(25);
		/*
		 * ASCENDING ORDER
		 */
		Collections.sort(arrayList, (I1, I2) -> (I1 > I2) ? +1 : (I1 < I2) ? -1 : 0);
		System.out.println("ELEMENTS IN ASCENDING ORDER:" + arrayList);

		/*
		 * DESCENDING ORDER
		 */
		Collections.sort(arrayList, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("ELEMENTS IN DESCENDING ORDER:" + arrayList);

		/*
		 * NOTE:BY DEFAULT IN TREESET IT WILL PRINT IN DEFAULT IN DEFAULT NATURAL
		 * SORTING ORDER
		 * 
		 * DESCENDING ORDER
		 */
		TreeSet<Integer> treeset = new TreeSet<Integer>((I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);
		treeset.add(10);
		treeset.add(0);
		treeset.add(20);
		treeset.add(14);
		treeset.add(25);

		System.out.println(treeset);

		/*
		 * NOTE:BY DEFAULT IN TREEMAP IT WILL PRINT IN DEFAULT IN DEFAULT NATURAL
		 * SORTING ORDER
		 * 
		 * DESCENDING ORDER
		 */
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
				(I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? +1 : 0);
		treeMap.put(101, "java");
		treeMap.put(110, "python");
		treeMap.put(105, "artificial intelligence");
		treeMap.put(111, "machine learning");
		treeMap.put(112, "ruby");

		System.out.println(treeMap);
	}

}
