import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapAValoresSeparadosPorComaEjemplo1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Madrid");
		map.put("B", "Copenhague");
		map.put("C", "Helsinki");
		map.put("D", "Viena");
		map.put("E", "Bruselas");
		map.put("Q", "Luxemburgo");
		map.put("R", "Mónaco");
		map.put("S", "Oslo");
		map.put("W", "Dublin");
		map.put("X", "Budapest");
		map.put("Y", "Roma");

		StringBuilder sb = new StringBuilder();
		Collection<String> col = map.values();
		
		for (String city : col) {
			sb.append(city).append(",");
		}
		
		System.out.println("-> " + sb.deleteCharAt(sb.lastIndexOf(",")).toString());
	}
}
