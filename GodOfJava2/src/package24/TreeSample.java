package package24;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
public class TreeSample {

	public static void main(String[] args) {
		TreeSample sample = new TreeSample();
		sample.checkTreeMap();
	}
	public void checkTreeMap() {
		TreeMap<String, String> map = new TreeMap<>();
		map.put("A", "e");
		map.put("°¡", "e");
		map.put("1", "f");
		map.put("a", "g");
		Set<Map.Entry<String, String>> entry = map.entrySet();
		for (Map.Entry<String, String> temp : entry) {
			System.out.println(temp.getKey() + " = " + temp.getValue());
		}
	}

}
