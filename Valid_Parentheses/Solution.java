import java.util.ArrayDeque;
class Solution {
    public boolean isValid(String s) {
		Deque<Character> stack = new ArrayDeque<Character>();
        char c, d;
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if(c == '(' || c == '{' || c == '[' )
				stack.addFirst(c);
			else if (stack.size() > 0){
				d = stack.removeFirst();
				if(Math.abs((int) c - (int) d) > 2)
					return false;
			}
			else
				return false;
		}
		if(stack.size() > 0)
			return false;
		
		return true;
    }
}