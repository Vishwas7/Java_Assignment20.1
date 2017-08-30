package Assignment1;
// importing classes, which are belongs from java.util.package;

import java.util.HashMap;
import java.util.Map;

public class GenericHashMap {

	public static void main(String[] args) {
		/**
		 * 1.In here Creating HashMap with default initial 
		 * capacity and load factor..
		 */
		HashMap<Integer, String> employee = new HashMap<Integer, String>();
		//2. in here Putting Empcode as key and EmpName as value..
		employee.put(001, "Sushant");
		employee.put(002, "Raj");
		employee.put(003, "Neha");
		employee.put(004, "Komal");
		employee.put(005, "Pradeep");
		employee.put(006, "Pooja");
		// window console
		System.out.println("Display the values");
		// 3. now In here mapping key with the values
		for(Map.Entry maP: employee.entrySet()){
			System.out.println(maP.getValue());
		}
	}
}


