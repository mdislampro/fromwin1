package lastJava;

import java.util.HashMap;
import java.util.Map;

public class MapC {

	public static void main(String[] args) {
		
		Map<Object,Object>mp = new HashMap<>();
		
		mp.put("Address","35-20 Leverich St");
		mp.put("Address1","Jackson Heights");
		mp.put("Apt","A709");
		mp.put("Zip Code",11372);
		mp.put("Phone",6462385944L);
		
		//System.out.println(mp);

		mp.remove("Apt");
		mp.put("Name", "Md Islam");
		//mp.put("Name", "Md Islam");
		//System.out.println(mp);

		//System.out.println(mp.get("Address1"));

		for(Object obj:mp.keySet()) {
			
			System.out.println(obj+"------>"+mp.get(obj));
			
		}
	}

}
