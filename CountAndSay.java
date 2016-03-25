import java.util.*;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AAAAAAAAAABB";
		String s2 = "10A2B";
		System.out.println(Encode(s1));
		System.out.println(Decode(s2));
	}

	public static String Encode(String s) {
		Stack<Character> stack = new Stack<Character>();
		String r = "";
		for(int i = 0; i < s.length(); i++) {
			if(stack.isEmpty()) {
				stack.push(s.charAt(i));
			} else {
				if(stack.peek() == s.charAt(i)) {
					stack.push(s.charAt(i));
				} else {
					r = r + "" + stack.size() + "" + stack.peek();
					stack.clear();
					stack.push(s.charAt(i));
				}
			}
		}
		if(!stack.isEmpty())
			r = r + "" + stack.size() + "" + stack.peek();		
		return r;
	}

	public static String Decode(String s) {
		int count = 0;
		String r = "";
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				count = count * 10 + (s.charAt(i) - '0'); 
			} else {
				for(int j = 0; j < count; j++)
					r = r + "" + s.charAt(i) + "";
				count = 0;
			}
		}
		return r;
	}
}
