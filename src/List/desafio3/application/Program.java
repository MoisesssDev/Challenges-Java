package List.desafio3.application;

import java.util.HashMap;

public class Program {
	public static void main(String[] args) {
		
		var map = new HashMap<String, Double>();
		
		map.put("Jose", 2.4);
		map.put("Moises", 6.2);
		map.put("Ricardo", 5.9);
		map.put("Paulo", 9.4);
		
		System.out.println(map);
		
		System.out.println(map.get("Moises"));
	}
}
