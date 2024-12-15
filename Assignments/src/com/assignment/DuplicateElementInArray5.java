package com.assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DuplicateElementInArray5 {
	public static void main(String[] args) {
		
		String a[]= {"java","python","c","c++","ruby","c#","c++"};
		
		//1. compare each element : o(n*n) worst soluton
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					System.out.println("duplicate name :: "+a[i]);
				}
			}
		}
		
		//2. using of HashSet: Java collection: it stores unique values: o(n) good one 
		Set<String> store= new HashSet<String>();
		for(String name :a) {
			if(store.add(name)==false) {
				System.out.println("duplicate name :: "+name);
			}
			
		}
		
	  // 3. using HashMap: o(2n)
		
		Map<String, Integer> storeMap=new HashMap<String, Integer>();
		
		for(String name: a) {
			Integer count =storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		
		//get the values from this HashMap:
		
	Set<Entry<String,Integer>> entrySet	=storeMap.entrySet();
	for(Entry<String , Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println("Duplicate element is :: "+entry.getKey());
		}
	}
		
	}

}
