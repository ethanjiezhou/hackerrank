import java.util.*;
import java.util.Map.Entry;

public class CountAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbcbbdeea";
		helper(input);
	}
	
	public static void helper(String input) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < input.length(); i++) {
        	if(map.containsKey(input.charAt(i))) {
        		map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
        	} else {
        		map.put(input.charAt(i), 1);
        	}
        }


        List<Map.Entry<Character, Integer>> list_Data = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());

        Collections.sort(list_Data, new Comparator<Map.Entry<Character, Integer>>()
        {
        	public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        		if(o1.getValue().compareTo(o2.getValue()) > 0) {
        			return 1;
        		} else {
        			return -1;
        		}
        	}
        });
        System.out.println(list_Data);
	}
}
