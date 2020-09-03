import java.util.Map;
import java.util.TreeMap;

public class Lab4 {
	
	public static void main(String[] args) {
		Map<String,Integer> map =new TreeMap<>();
		map.put("Sima", 60);
		map.put("Lina", 44);
		map.put("Meena", 78);
		System.out.println(map);
		map.put("Lina",444);
		map.put("meena",222);
		System.out.println(map);
		
		System.out.println("Marks for Lina = " + map.get("Lina"));
		
	}
}
