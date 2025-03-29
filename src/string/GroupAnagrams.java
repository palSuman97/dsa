package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		List<String> strs = Arrays.asList("eat","tea","tan","ate","nat","bat");
		Map<String, List<String>> anagramMp= new HashMap<>();
		
		
		for(int i=0;i<strs.size();i++) {
			String key = sortStr(strs.get(i));
			if(anagramMp.containsKey(key))
				anagramMp.get(key).add(strs.get(i));
			else {
				List<String> ls = new ArrayList<>();
				ls.add(strs.get(i));
				anagramMp.put(key, ls);
			}
		}		
		
		
		anagramMp.forEach((x,y)-> {
			y.forEach(content-> System.out.print(content+" "));
			System.out.println();
		});
		
	}

	private static String sortStr(String str) {
		
		char[] tempStr = str.toCharArray();
		Arrays.sort(tempStr);
		
		return  new String(tempStr);
	}

}
