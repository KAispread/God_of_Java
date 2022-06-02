package package24;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Collection;

public class MapSample {

	public static void main(String[] args) {
		MapSample sample = new MapSample();
		HashMap<String, String> map = sample.creatMap();
		sample.checkRemove(map);
	}
	
	public HashMap<String, String> creatMap() {
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "alpha");
		map.put("B", "balance");
		map.put("C", "character");
		return map;
	}
	
	public <T> void checkMap(HashMap<T, T> map) {
		Set<T> set = map.keySet();
		
		Iterator<T> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public <T> void checkValues(HashMap<T, T> map) {
		Collection<T> values = map.values();
		for(T a : values) {
			System.out.println(a);
		}
	}
	
	public <T> void checkHashMapEntry(HashMap<T, T> map) {
		Set<Map.Entry<T, T>> entry = map.entrySet();
		for (Map.Entry<T, T> tempEntry : entry) {
			System.out.println(tempEntry.getKey()+" = "+tempEntry.getValue());
		}
	}
	
	public <T> void checkContains(HashMap<T, T> map) {
		System.out.println(map.containsKey("A"));
		System.out.println(map.containsKey("Z"));
		System.out.println(map.containsValue("alpha"));
		System.out.println(map.containsValue("alp"));
	}
	
	public <T> void checkRemove(HashMap<T, T> map) {
		checkHashMapEntry(map);
		System.out.println(map.remove("A"));
		checkHashMapEntry(map);
	} 
}
