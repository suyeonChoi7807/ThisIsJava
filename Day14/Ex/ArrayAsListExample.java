package com.kosta.day14.Ex;
import java.util.*;

public class ArrayAsListExample {

	public static void main(String[] args) {
		List<String> list1= Arrays.asList("ȫ�浿","�ſ��","���ڹ�");
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2= Arrays.asList(1,2,3);
		for(int value: list2) {
			System.out.println(value);
		}
		list2.add(4);
	}

}
