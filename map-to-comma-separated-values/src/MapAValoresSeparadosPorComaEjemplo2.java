import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class MapAValoresSeparadosPorComaEjemplo2 {
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
		
		String values = StringUtils.join(map.values(), ",");
		
		System.out.println("-> " + values);
	}
}
