package com.saksham.JAVA10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VarUpdates {

	public static void main(String[] args) {
		
		var a = 10;

		var mn = new HashMap<String, List<String>>();
		
		for(var en : mn.entrySet()) {
			var value = en.getValue();
		}
		
		var list = new ArrayList<Integer>();
		list.add(22);
	}

}
